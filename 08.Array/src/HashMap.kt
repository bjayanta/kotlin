fun main(args: Array<String>) {
    var hashmap = HashMap<Any, String>()
    hashmap.put("A", "Jayanta")
    hashmap.put("B", "Maruf")
    hashmap.put(2, "Imran")
    hashmap.put("D", "Arif")
    hashmap.put("E", "Suman")

    println(hashmap.get("E"))
    println(hashmap.get(2))

    for (k in hashmap.keys) {
        println(hashmap.get(k))
    }

}