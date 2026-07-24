import FlightDetails from "./FlightDetails";

function GuestPage({login}){
    return(
        <div>
            <h1> Welcome to Guest Page </h1>
            <p> Please login to book your tickets </p>
            <FlightDetails />  

            <button onClick={login}>Login</button> 
        </div>
    );
}

export default GuestPage;