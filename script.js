// Set a cookie with the given name, value, and expiration time (in days)
const setCookie = (cName, cValue, exDays) => {
  Cookies.set(cName, cValue, { expires: exDays });
}

// Get the value of a cookie with the given name
const getCookie = (cName) => {
  return Cookies.get(cName);
}

// Add a click event listener to the element with the ID "cookies-btn"
document.querySelector("#cookies-btn").addEventListener("click", () => {
  // Hide the cookie banner
  document.querySelector("#cookies").style.display = "none";
  // Set a cookie with the name "cookie", the value "true", and an expiration time of 30 days
  setCookie("cookie", true, 30);
});

// Check if the "cookie" cookie has been set when the page loads
const cookieMessage = () => {
  if (!getCookie("cookie")) {
    // Display the cookie banner
    document.querySelector("#cookies").style.display = "block";
  }
};

// Add a load event listener to the window object to call the cookieMessage function
window.addEventListener("load", cookieMessage);
