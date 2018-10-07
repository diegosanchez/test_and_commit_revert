class Hours {
  constructor(ticks) {
    this.first = "disabled"
    if(ticks >= 3599) {
      this.first = "enabled"
    }
  }

  asJson() {
    return [this.first, "disabled", "disabled", "disabled"]
  }
};

module.exports = Hours;