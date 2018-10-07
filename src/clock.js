class Clock {
    constructor() {
    }

    tick() {
        return {
            second: "enabled",
            five_hours: ["disabled", "disabled", "disabled", "disabled"],
            hours: ["disabled", "disabled", "disabled", "disabled"],
            quarters: [
                "disabled", 
                "disabled", 
                "disabled", // 15
                "disabled", 
                "disabled", 
                "disabled", // 30
                "disabled", 
                "disabled", 
                "disabled", // 45
                "disabled",
                "disabled"
            ],
            minutes: ["disabled", "disabled", "disabled", "disabled"]
        };
    }
};

module.exports = Clock;
