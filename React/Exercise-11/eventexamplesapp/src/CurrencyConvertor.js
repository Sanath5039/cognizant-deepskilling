import React, { useState } from "react";

function CurrencyConvertor() {

    const [rupees, setRupees] = useState("");
    const [euro, setEuro] = useState("");

    const handleSubmit = () => {
        const rate = 0.091;
        setEuro((rupees * rate).toFixed(2));
    };

    return (
        <div>
            <h2>Currency Convertor !!!</h2>

            <label>Indian Rupees: </label>

            <input
                type="number"
                value={rupees}
                onChange={(e) => setRupees(e.target.value)}
            />

            <br /><br />

            <button onClick={handleSubmit}>
                Convert
            </button>

            <h3>Euro : {euro}</h3>
        </div>
    );
}

export default CurrencyConvertor;