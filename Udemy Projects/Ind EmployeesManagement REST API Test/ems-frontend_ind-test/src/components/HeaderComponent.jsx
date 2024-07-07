import { NavLink, useNavigate } from "react-router-dom";
import { isUserLoggedIn, logout } from "../services/AuthService";

const HeaderComponent = () => {
  const isAuth = isUserLoggedIn();

  const navigator = useNavigate();

  function handleLogout() {
    logout();
    navigator("/login");
  }

  return (
    <div>
      <header>
        <nav className="navbar navbar-dark bg-dark navbar navbar-expand-lg">
          <a
            className="navbar-brand"
            href="https://www.techin.lt"
            style={{ paddingLeft: "20px" }}
          >
            Employee Management System
          </a>

          <div className="collapse navbar-collapse" id="navbarNav">
            <ul className="navbar-nav">
              {isAuth && (
                <li className="nav-item">
                  <NavLink className="nav-link" to="/employees">
                    Employees
                  </NavLink>
                </li>
              )}

              {/* <li className="nav-item">
                <NavLink className="nav-link" to="/employees">
                  Employees
                </NavLink>
              </li> */}

              {isAuth && (
                <li className="nav-item">
                  <NavLink className="nav-link" to="/departments">
                    Departments
                  </NavLink>
                </li>
              )}

              {/* <li className="nav-item">
                <NavLink className="nav-link" to="/departments">
                  Departments
                </NavLink>
              </li> */}
            </ul>
          </div>

          <ul className="navbar-nav">
            {!isAuth && (
              <li className="nav-item">
                <NavLink
                  to="/register"
                  className="nav-link"
                  style={{ paddingRight: "20px" }}
                >
                  Register
                </NavLink>
              </li>
            )}
            {/* <li className="nav-item">
              <NavLink
                to="/register"
                className="nav-link"
                style={{ paddingRight: "20px" }}
              >
                Register
              </NavLink>
            </li> */}

            {!isAuth && (
              <li className="nav-item">
                <NavLink
                  to="/login"
                  className="nav-link"
                  style={{ paddingRight: "20px" }}
                >
                  Login
                </NavLink>
              </li>
            )}
            {/* <li className="nav-item">
              <NavLink
                to="/login"
                className="nav-link"
                style={{ paddingRight: "20px" }}
              >
                Login
              </NavLink>
            </li> */}

            {isAuth && (
              <li className="nav-item">
                <NavLink
                  to="/login"
                  className="nav-link"
                  style={{ paddingRight: "20px" }}
                  onClick={handleLogout}
                >
                  Logout
                </NavLink>
              </li>
            )}
          </ul>
        </nav>
      </header>
    </div>
  );
};

export default HeaderComponent;
