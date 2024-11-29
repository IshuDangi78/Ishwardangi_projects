document.getElementById("contactForm").addEventListener("submit", function (event) {
  event.preventDefault(); // Prevent form submission
  const name = document.getElementById("name").value;
  const email = document.getElementById("email").value;
  const message = document.getElementById("message").value;

  // Simulate form submission
  console.log("Form submitted!");
  console.log("Name:", name);
  console.log("Email:", email);
  console.log("Message:", message);

  alert("Thank you for your message, " + name + "!");
});
