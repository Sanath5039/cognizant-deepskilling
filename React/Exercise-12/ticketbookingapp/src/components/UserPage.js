import FlightDetails from "./FlightDetails";

function UserPage({logout}){

    const bookTickets = () => {
        alert("Select any one flight to book ticket");
    };
     
    return(
        <div>
            <h1> Welcome to User Page </h1>
            <p> You can book your flight tickets here </p>
            <FlightDetails />
            <br />
            <button onClick={bookTickets}>Book Tickets</button>
            <br /> <br />
            <button onClick={logout}>Logout</button>
        </div>
    );
}

export default UserPage;
