<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Simple Calculator</title>
    <link rel="stylesheet" type="text/css" href="/style.css">
</head>
<body>

    <div class="calculator-container">
        
        <div class="calculator-header">
            <h2>Simple Calculator</h2>
        </div>

        <form action="/calculate" method="post" class="calculator-form">
            
            <div class="input-group">
                <label for="no1">ENTER FIRST NUMBER:</label>
                <input type="number" step="any" id="no1" name="no1" value="${no1}" placeholder="0" required>
            </div>

            <div class="input-group">
                <label for="no2">ENTER SECOND NUMBER:</label>
                <input type="number" step="any" id="no2" name="no2" value="${no2}" placeholder="0" required>
            </div>

            <div class="input-group">
                <label for="operation">CHOOSE OPERATION:</label>
                <select id="operation" name="operation">
                    <option value="1">Addition (+)</option>
                    <option value="2">Subtraction (-)</option>
                    <option value="3">Multiplication (*)</option>
                    <option value="4">Division (/)</option>
                </select>
            </div>

            <button type="submit" class="btn-calc">Calculate</button>

        </form>

        <!-- White Box for Result -->
        <div class="result-box">
            <span class="result-title">RESULT</span>
            <span class="result-text">${result != null ? result : "--"}</span>
        </div>

    </div>

</body>
</html>