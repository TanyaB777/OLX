package hw_8;

import java.util.List;

public interface SessionCloser {
    void closeSession(List<CanBeClosed> entities);
}
