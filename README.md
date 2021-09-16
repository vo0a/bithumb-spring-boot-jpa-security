### 테스트에 활용할 JSON
- /users/signup
```json
{
    "username":"tom",
    "password":"00000000",
    "name":"Tom Cruise",
    "email":"tom@test.com"
}
```

### React 에서 전송하는 form
> 로그인
```js
import React, {useState} from 'react'
import './Login.css';
import axios from 'axios';
const LoginForm = () => {
    const [values, setValues] = useState({
        username : '',
        password   : '',
    });
    const login = e => {
        e.preventDefault()

        const headers = {
            'Content-Type'  : 'application/json',
            'Authorization' : 'JWT fefege..'
        }
        const data = {
            username    : values.username,
            password      : values.password
        }

        alert(`Login Click`)
        axios.post(`http://localhost:8080/users/signin`,JSON.stringify(data),{headers})
        .then(res => {
          alert(`${res.data.message} 명 등록됨 ` )
        })
        .catch(err => {
          alert(`FAILURE`)
        })
      }
      const handleChange = name => event => {
        setValues({ ...values, [name] : event.target.value });
    };
    return  (<>
        <form>
            <div className="imgcontainer">
                <img src="img_avatar2.png" alt="Avatar" className="avatar"/>
            </div>
            <div className="container">
                <label htmlFor="username"><b>Username</b></label>
                <input type="text"
                       placeholder="Enter Username"
                       name="username"
                       onChange={handleChange('username')}
                       required/>
                <label htmlFor="password"><b>Password</b></label>
                <input type="password"
                       placeholder="Enter Password"
                       name="password"
                       onChange={handleChange('password')}
                       required/>
                <button type="submit" onClick={login} >Login</button>
                <label>
                <input type="checkbox"
                       checked="checked"
                       name="remember"/> Remember me
                </label>
            </div>
            <div className="container" style= {{backgroundColor: "#F1F1F1"}}>
                <button type="button" className="cancelbtn">Cancel</button>
                <span className="psw">Forgot <a href="#">password?</a></span>
            </div>
        </form>
    </>)
}
export default LoginForm;
```