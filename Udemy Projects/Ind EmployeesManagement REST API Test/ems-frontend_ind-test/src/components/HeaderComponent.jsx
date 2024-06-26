import { NavLink } from "react-router-dom";

const HeaderComponent = () => {
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
              <li className="nav-item">
                <NavLink className="nav-link" to="/employees">
                  Employees
                </NavLink>
              </li>

              <li className="nav-item">
                <NavLink className="nav-link" to="/departments">
                  Departments
                </NavLink>
              </li>
            </ul>
          </div>

          <ul className="navbar-nav">
            <li className="nav-item">
              <NavLink
                to="/register"
                className="nav-link"
                style={{ paddingRight: "20px" }}
              >
                Register
              </NavLink>
            </li>
            <li className="nav-item">
              <NavLink
                to="/login"
                className="nav-link"
                style={{ paddingRight: "20px" }}
              >
                Login
              </NavLink>
            </li>
          </ul>
        </nav>
      </header>
    </div>
  );
};

export default HeaderComponent;
