class BrowserHistory {
    Stack<String> history= new Stack();
    Stack<String> future;

    BrowserHistory(String homepage) {
        history.push(homepage);
        future = new Stack<>();
    }

    void visit(String url) {
        history.push(url);
        future = new Stack<>();
    }

    String back(int steps) {
        while(steps > 0 && history.size() > 1) {
            future.push(history.peek());
            history.pop();
            steps--;
        }
        return history.peek();
    }

    String forward(int steps) {
        while(steps > 0 && future.size() > 0) {
            history.push(future.peek());
            future.pop();
            steps--;
        }
        return history.peek();
    }
}
