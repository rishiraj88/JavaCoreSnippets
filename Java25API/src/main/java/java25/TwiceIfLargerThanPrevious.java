import java.util.stream.Gatherer;
import java.util.stream.Stream;

public class TwiceIfLargerThanPrevious {
    public static Gatherer<Integer, ?, Integer> doTwiceIfLargerThanPrevious() {
        class State {
            boolean hasPrev = false;
            int prev = 0;
        }

        return Gatherer.ofSequential(
                State::new,
                Gatherer.Integrator.ofGreedy((state, elem, downstream) -> {

                    if (!state.hasPrev) {
                        downstream.push(elem);
                    } else {
                        if (elem > state.prev) {
                            downstream.push(elem * 2);
                        } else {
                            downstream.push(elem);
                        }
                    }

                    // for next iteration
                    state.prev = elem;
                    state.hasPrev = true;

                    // continue
                    return true;
                })
        );
    }

    void main(String[] args) {
        Stream.of(5, 10, 3, 8, 12)
                .gather(doubleIfLarger())
                .forEach(System.out::println);
    }
}