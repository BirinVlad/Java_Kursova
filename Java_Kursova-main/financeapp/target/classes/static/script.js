document.addEventListener("DOMContentLoaded", function () {
    const registerForm = document.getElementById("registerForm");
    if (registerForm) {
        registerForm.addEventListener("submit", async function (event) {
            event.preventDefault();
            const formData = new FormData(registerForm);
            const data = {
                username: formData.get("username"),
                email: formData.get("email"),
                password: formData.get("password")
            };

            try {
                const response = await fetch("/auth/sign-up", {
                    method: "POST",
                    headers: {
                        "Content-Type": "application/json"
                    },
                    body: JSON.stringify(data)
                });

                if (response.ok) {
                    alert("Registration successful");
                } else {
                    alert("Registration failed");
                }
            } catch (error) {
                console.error("Error:", error);
                alert("An error occurred");
            }
        });
    }

    const loginForm = document.getElementById("loginForm");
    if (loginForm) {
        loginForm.addEventListener("submit", async function (event) {
            event.preventDefault();
            const formData = new FormData(loginForm);
            const data = {
                email: formData.get("email"),
                password: formData.get("password")
            };

            try {
                const response = await fetch("/auth/sign-in", {
                    method: "POST",
                    headers: {
                        "Content-Type": "application/json"
                    },
                    body: JSON.stringify(data)
                });

                if (response.ok) {
                    const result = await response.json();
                    localStorage.setItem("token", result.token);
                    alert("Login successful");
                } else {
                    alert("Login failed");
                }
            } catch (error) {
                console.error("Error:", error);
                alert("An error occurred");
            }
        });
    }

    // Similarly, you can add more event listeners for fetching and displaying data for accounts, budgets, etc.
});
