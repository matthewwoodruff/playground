package main

import "fmt"
import "time"
import "sync"

const MY_CONST string = "i will never change"
var declareString string
var setString string = "double quotes!!"
var (
	bulkVar1 string
	bulkVar2 int = 2
)

func withArgsAndReturnValue(a string, b int) int {
	fmt.Println(a)
	return b + 2
}

func main() {
	var myVar string = "hahaa"
	implicitType := 3
	fmt.Println(myVar)
	fmt.Println(MY_CONST)
	fmt.Printf("%s, you see, %s, %d\n", myVar, MY_CONST, implicitType)

	implicitFunc := func() {
		fmt.Println("Hello World")
	}
	implicitFunc()

	fmt.Println(withArgsAndReturnValue("hello", 4))

	waiter := new (sync.WaitGroup)
	waiter.Add(1)
	go simples("222", 1 * time.Second, waiter)
	fmt.Println("Waiting")
	waiter.Wait()
	fmt.Println("Done!!!!")
}


func simples(a string, duration time.Duration, waiter *sync.WaitGroup) {
	time.Sleep(duration)
	fmt.Println(a)
	waiter.Done()
}
