import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';

class Welcome extends Component {

  constructor(props) {
    super(props);
    this.state = {name: props.name, date: new Date(), counter: 0};
  }

  componentDidMount() {
    this.timerID = setInterval(() => this.tick(), 1000);
  }

  componentWillUnmount() {
    clearInterval(this.timerID);
  }

  tick() {
    this.setState((prevState, props) => ({
      date: new Date(),
      counter: prevState.counter + 1
    }));
  }

  render() {
    return (
      <div className="App">
        <div className="App-header">
          <img src={logo} className="App-logo" alt="logo" />
          <h2>Welcome to React, {this.state.name}, the counter is {this.state.counter}</h2>
        </div>
        <p className="App-intro">
          To get started, edit <code>src/App.js</code> and save to reload.
        </p>
        <p>This time is {this.state.date.toString()}</p>
      </div>
    );
  }
}

export default Welcome;
