package inheritance

// see https://twitter.github.io/scala_school/advanced-types.html#fbounded
trait FBounded[A <: FBounded[A]] extends MyTrait {

  def compare(that:A):Int

}
