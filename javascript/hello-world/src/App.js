import React, { Component } from 'react';
import Filter from './Filter';
import Welcome from './Welcome';

class App extends Component {
  render() {
    return (
      <div className="App">
        <Welcome name="Matt"/>
        <Filter />
      </div>
    );
  }
}

export default App;
