import http from 'k6/http';
import { check, sleep } from 'k6';

export const options = {
    stages: [
        { duration: '30s', target: 20 },
        { duration: '1m30s', target: 25 },
        { duration: '20s', target: 3 },
    ],
};

export default function () {
    const res = http.get('http://localhost:8080/people');
    check(res, { 'status was 200': (r) => r.status === 200 });
    sleep(1);
}
