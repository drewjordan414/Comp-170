// bmi calculator
// input current weight 
let w = parseFloat(prompt("Enter your weight in pounds: "));
let h = parseFloat(prompt("Enter your height in inches: "));
let bmi = w / (h * h) * 703;
console.log("Your BMI is " + bmi.toFixed(2));



