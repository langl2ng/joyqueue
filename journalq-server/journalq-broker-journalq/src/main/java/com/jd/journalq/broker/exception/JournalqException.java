/**
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.jd.journalq.broker.exception;

import com.jd.journalq.exception.JournalqCode;

/**
 * JournalqException
 * author: gaohaoxiang
 * email: gaohaoxiang@jd.com
 * date: 2018/12/5
 */
public class JournalqException extends RuntimeException {

    private int code;

    public JournalqException(Throwable cause) {
        super(cause);
    }

    public JournalqException(int code) {
        this.code = code;
    }

    public JournalqException(String message, int code) {
        super(message);
        this.code = code;
    }

    public JournalqException(JournalqCode code, Object... args) {
        super(code.getMessage(args));
        this.code = code.getCode();
    }

    public JournalqException(JournalqCode code, Throwable cause, Object... args) {
        super(code.getMessage(args), cause);
        this.code = code.getCode();
    }

    public JournalqException(String message, Throwable cause, int code) {
        super(message, cause);
        this.code = code;
    }

    public JournalqException(Throwable cause, int code) {
        super(cause);
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}