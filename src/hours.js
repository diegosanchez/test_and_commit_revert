class Hours {
  constructor(ticks) {
    this.first = "disabled"
    if(ticks >= 3599) {
      this.first = "enabled"
    }

    this.second = "disabled"
    if(ticks >= 3599 * 2) {
      this.second = "enabled"
    }
  }

  asJson() {
    return [this.first, this.second, "disabled", "disabled"]
  }
};

module.exports = Hours;