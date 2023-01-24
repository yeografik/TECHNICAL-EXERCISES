import React from 'react';
import ReactDOM from 'react-dom/client';


export function Person(props) {
  const data = props.data;
    return (
        <ul>
            {data.map(item => <li key="{item.dni}">{item.firstname} {item.lastname} {item.dni}</li>)}
        </ul>
        );
}

const data = [{ firstname: "demo", lastname: "demo", dni: 1234 }];
ReactDOM.createRoot( 
  document.querySelector('#root')
).render(<Person data={data} />);
