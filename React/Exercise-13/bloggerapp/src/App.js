import logo from './logo.svg';
import './App.css';
import BookDetails from './components/BookDetails';
import BlogDetails from './components/BlogDetails';
import CourseDetails from './components/CourseDetails';

function App() {

  // 5. Using Switch case
  
  const choice = 3;
  let component;
  switch(choice) {
    case 1: 
      component = <BookDetails />
      break;
    case 2:
      component = <BlogDetails />
      break;
    case 3:
      component = <CourseDetails />
  }
  return(
    <div className='container'>
      {component}
    </div>
  );


  // // 4. Using AND Operator
  // const choice = 2;
  // return(
  //   <div className='container'>
  //     {choice === 1 &&  <BookDetails/>}
  //     {choice === 2 &&  <BlogDetails/>}
  //     {choice === 3 &&  <CourseDetails/>}

  //   </div>
  // );


  // // 3. Using Ternary Operator
  // const choice = 3;
  // return(
  //   <div className='container'> 
  //     {
  //       choice === 1 ? <BookDetails /> : choice === 2 ? <BlogDetails /> : <CourseDetails />
  //     }
  //   </div>
  // );


  // // 2. Using Element conditional rendering
  // const choice = 1;
  // let component;
  // if(choice === 1){
  //   component = <BookDetails />
  // }
  // else if(choice === 2){
  //   component = <BlogDetails/>
  // }
  // else{
  //   component = <BookDetails />
  // }
  // return (
  //   <div className='container'>
  //     {component}
  //   </div>
  // );


  // // 1. Using If else conditional rendering
  // const choice = 2;
  // if(choice === 1){
  //   return(
  //     <div className="container">
  //       <BookDetails />
  //     </div>
  //   );
  // }
  // else if(choice === 2){
  //   return(
  //     <div className="container">
  //       <BlogDetails />
  //     </div>
  //   );
  // }
  // else{
  //   return(
  //     <div className="container">
  //       <CourseDetails />
  //     </div>
  //   );
  // }


}

export default App;
