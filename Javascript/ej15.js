import React from 'react';
import ReactDOM from 'react-dom/client';


export function Title(props) {
  const data = props.data;
    return (
        <h1> {data} </h1>
        );
}

const data = "Main title of the page";
ReactDOM.createRoot( 
  document.querySelector('#root')
).render(<Title data={data} />);
