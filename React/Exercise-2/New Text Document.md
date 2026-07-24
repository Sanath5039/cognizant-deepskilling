**1) Explain React components ?** 

**A)** A React Component is a reusable and independent piece of code that returns JSX (UI). Components help divide a user interface into smaller, manageable, and reusable parts.

&#x09;**EX:** 

&#x09;	function Welcome(){

&#x09;		return <h1> Welcome to Cognizant </h1>

&#x09;	}

&#x09;	export default Welcome;



**2) Identify the differences between components and JavaScript functions ?**

**A) components:** 

&#x09;	Returns JSX (UI elements).

&#x09;	Used to build user interfaces

&#x09;	Can receive props.

&#x09;	Can use React Hooks (functional components).

&#x09;	Component names start with a capital letter.

&#x09;	Rendered using <Component />.

&#x20;  **JavaScript functions:** 

&#x09;	Returns any JavaScript value.

&#x09;	Used for general programming logic

&#x09;	Receives normal function arguments.

&#x09;	Cannot use React Hooks.

&#x09;	Function names can follow any valid naming convention.

&#x09;	Called using functionName().



**3) Identify the types of components ?** 

**A) i). Functional Components**

&#x09;Simple JavaScript functions.

&#x09;Return JSX.

&#x09;Can use Hooks (useState, useEffect, etc.).

&#x09;Recommended in modern React.



&#x09;**EX:** 

&#x09;    function Welcome(){

&#x09;	return <h1> Welcome to Cognizant </h1>

&#x09;    }

&#x20;  **ii) Class Components**

&#x09;ES6 classes that extend React.Component.

&#x09;Use render() to return JSX.

&#x09;Support lifecycle methods.

&#x09;Used before Hooks became available.



4\) **Explain class component ?**

**A)** A Class Component is a JavaScript ES6 class that extends React.Component and must implement the render() method to display the UI.

&#x09;**EX:** 

&#x09;	import React,{Component} from "React";

&#x09;	class Student extends Component{

&#x09;		render(){

&#x09;			return(

&#x09;				<h2> Welcome Student </h2> 

&#x09;			)

&#x09;		}

&#x09;	}



&#x09;	export default Student;



5\) **Explain function component ?** 

**A)** A Functional Component is a JavaScript function that returns JSX. It is the preferred way of creating components in modern React because it is simpler and supports Hooks.

&#x09;**EX:** 

&#x09;	function Student(){

&#x09;		return(

&#x09;			<h2> Welcome Student </h2>

&#x09;		);

&#x09;	}

&#x09;	export default Student;

**6) Define component constructor ?**

**A)** A Constructor is a special method in a class component that is called automatically when the component is created. It is mainly used to initialize the component's state and bind event handler methods.

&#x09;**Syntax:** 

&#x09;	constructor(props) {

&#x20;   			super(props); // calls the constructor of parent class

&#x09;	}



**7) Define render() function ?**

**A)** The render() function is a mandatory method in class components. It returns the JSX that React displays on the screen.

&#x09;**EX:** // same example as class component















































































