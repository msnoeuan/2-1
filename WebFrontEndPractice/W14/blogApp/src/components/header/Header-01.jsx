// ./src/components/header/Header.jsx  (01)
import { useContext } from "react"
import { Link } from "react-router-dom"
import Login from "./login/Login"
import Logout from "./logout/Logout"
import imgLogo from "../../assets/Logo.svg"
import UserContext from "../../context/UserContext"
import "./header.css"
import "./button.css"

function Header() {
  const { isLogin } = useContext(UserContext)
  // console.log(isLogin)
  return (
	<header>
		<div class="max-width">
			<h1>
				<a href="./">
					<img src="./assets/Logo.svg" alt="My Blog" />
				</a>
			</h1>
			<ul>
				<li class="profile-img">
					<a href="#">
						<img src="./assets/profile.jpg" alt="My Page" />
					</a>
				</li>
				<li>
					<a href="#" class="button">
						<img src="./assets/icon-modify-white.svg" alt="" />
						<span>Write</span>
					</a>
				</li>
				<li>
					<button class="button white">
						<img src="./assets/icon-logout.svg" alt="" />
						<span>Logout</span>
					</button>
				</li>
				<li>
					<a href="#" class="button gray">
						<img src="./assets/icon-login.svg" alt="" />
						<span>Login</span>
					</a>
				</li>
				<li class="only-pc">
					<a href="#" class="button gray">
						<img src="./assets/icon-register.svg" alt="" />
						<span>Register</span>
					</a>
				</li>
			</ul>
		</div>
	</header>
  )
}

export default Header

