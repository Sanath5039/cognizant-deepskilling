import officeImage from './office.png';
import './App.css';

function App() {
  const office = {
    name: "Tech Park",
    rent: 55000,
    address: "Madhapur, Hyderabad"
  }

  const offices = [
    {
      id: 1,
      name: "Tech Park",
      rent: 55000,
      address: "Madhapur, Hyderabad"
    },

    {
      id:2,
      name: "DLF Cyber City",
      rent: 75000,
      address: "Chennai"
    },

    {
      id:3,
      name:"Cognizant Office",
      rent: 70000,
      address: "Bengaluru"
    }
  ]

  return (
    <div className="App">
      <h1> Office Space Rental App</h1> 
      <img 
        src = {officeImage}
        alt="Office Space"
        width="200"
      />

      <h2> Single Office details </h2>
      <p><b>Name: </b>{office.name}</p>
      <p> 
        <b>Rent: </b>
        <span 
          className={office.rent < 60000 ? "red" : "green"} >
            {office.rent}
        </span> 
      </p>

      <p><b>Address: </b>{office.address}</p>

      <h2> Office List </h2>

      {
        offices.map((item)=>(
          <div className="card" key={item.id}>
            <h3> { item.name } </h3>
            <p>
              <b> Rent: </b>
              <span 
                className={item.rent < 60000 ? "red" : "green"} > {item.rent}
              </span>
            </p>
            <p> <b>Address: </b> {item.address} </p> 
          </div>
        ))
      }
    </div>
  );
}

export default App;
