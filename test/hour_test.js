const expect = require('chai').expect;

const Hours = require('../src/hours.js');

describe("Hours Unit Tests", () => {

  it('First hour', () => {
    hours = new Hours(3599);
    actual = hours.asJson();

    expected = ["enabled", "disabled", "disabled", "disabled"];

    expect(expected).to.be.eql(actual);
  });
  it('Before first hour', () => {
    hours = new Hours(3598);
    actual = hours.asJson();

    expected = ["disabled", "disabled", "disabled", "disabled"];

    expect(expected).to.be.eql(actual);
  });

  
});
