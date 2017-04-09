var p = 0.1;

for (var limit = 10; limit <= 100000000; limit *= 10) {
    var s = 0;
    for (var i = 0; i < limit; i++) {
        s += p;
    }
    console.log("limit: " + limit + " --> " + s);
}
