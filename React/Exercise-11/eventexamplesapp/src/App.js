import logo from './logo.svg';
import './App.css';
import React, { useState } from 'react';
import CurrencyConvertor from './CurrencyConvertor';


function App() {
  const [count, setCount] = useState(0);
  const increment = ()=>{
    setCount(prev=>prev+1)
  };
  const decrement = () => {
    setCount(prev=>prev-1)
  };
  const sayHello = () => {
    alert("Hello! Memeber")
  }
  const handleIncrement = () => {
    increment();
    sayHello();
  }
  const welcome = () => {
    alert("Welcome");
  }
  const onPress = () => {
    alert("I Was Clicked");
  }
  return(
    <div className="container">
      <h1> Event Examples </h1>
      <h3> Counter: {count} </h3>
      
      <button onClick={handleIncrement}>
        Increment
      </button>
      <br /> <br />

      <button onClick={decrement}>
        Decrement
      </button>
      <br /> <br />

      <button onClick={welcome}>
        Say Welcome
      </button>
      <br /> <br />
      
      <button onClick={onPress}>
        Click on me
      </button>

      <CurrencyConvertor />
    </div>
  );
}

export default App;
