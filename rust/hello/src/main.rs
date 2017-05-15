use std::io::Write;
use std::str::FromStr;

fn gcd(mut n: u64, mut m: u64) -> u64 {
    assert!(n != 0 && m != 0);
    while m != 0 {
        if m < n {
            let t = m; m = n; n = t;
        }
        m = m % n;
    }
    n
}

fn main() {
    println!("Hello, world!");
    let answer: u64 = gcd(10, 20) ;
    println!("{}", answer);

    let mut numbers = Vec::new();

    for arg in std::env::args().skip(1) {
        numbers.push(u64::from_str(&arg)
                     .expect("error parsing argument"));
    }

    if numbers.len() == 0 {
        writeln!(std::io::stderr(), "Usage: gcd NUMBER ...").unwrap();
        std::process::exit(1);
    }

    let mut d = numbers[0];
    for m in &numbers[1..] {
        d = gcd(d, *m);
    }

    println!("The greatest common divisor of {:?} is {}",
             numbers, d);
}

fn myfunc( a_string: String, number: u64 ) {
    if number == 0 {
        println!("{}", a_string);
    } else {
        println!("{}", number);
        myfunc(a_string, number - 1);
    }
}

#[test]
fn gcd_should_work() {
    assert_eq!(gcd(10, 20), 10);
}

