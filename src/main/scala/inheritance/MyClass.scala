package inheritance

class MyClass extends MyAbstract with MyTrait[MyClass] {
  def compare(that: MyClass) = 0
}
