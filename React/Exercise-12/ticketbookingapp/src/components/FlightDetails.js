function FlightDetails(){
    const flights = [
        {id:1,flight:"Indigo",from:"Hyderabad",to:"Delhi",fare:"5000"},
        {id:2,flight:"Air India",from:"Mumbai",to:"Chennai",fare:"4800"},
        {id:3,flight:"Indigo",from:"Bangolore",to:"Kolkata",fare:"5500"},

    ];

    return (
        <div>
            <h2> FlightDetails </h2>
            <table>
                <thead>
                    <tr>
                        <th>flight</th>
                        <th>from</th>
                        <th>to</th>
                        <th>fare</th>
                    </tr>
                </thead>
                <tbody>
                    {
                        flights.map((flight)=>(
                            <tr key={flight.id}>
                                <td> {flight.flight} </td>
                                <td> {flight.from} </td>
                                <td> {flight.to} </td>
                                <td> {flight.fare} </td>
                            </tr>
                        ))
                    }
                </tbody>
            </table>
        </div>
    );
}

export default FlightDetails;