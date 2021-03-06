/*
 * Copyright (c) 1985-2005 by Marc J. Rochkind. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification,
 * are permitted provided that the following conditions are met:
 *  - Redistributions of source code must retain the above copyright notice,
 *    this list of conditions and the following disclaimer.
 *  - Redistributions in binary form must reproduce the above copyright notice, this
 *    list of conditions and the following disclaimer in the documentation and/or
 *    other materials provided with the distribution.
 *  - The name of the copyright holder, Marc J. Rochkind, may not be used to endorse
 *    or promote products derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDER "AS IS" AND ANY EXPRESS OR IMPLIED
 * WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY
 * AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
 * OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package jtux;

public class UClock {
	static {
		System.loadLibrary("jtux");
	}

	/**
		Calls alarm.
		<p>
		<font size="-1"><b><i>Click {@link <a href="doc-files/synopses.html#alarm">here</a>} for Posix/SUS C API.</i></b></font>
	*/
	public static native int alarm(int secs);
	/**
		Calls nanosleep.
		<p>
		<font size="-1"><b><i>Click {@link <a href="doc-files/synopses.html#nanosleep">here</a>} for Posix/SUS C API.</i></b></font>
	*/
	public static native void nanosleep(UProcess.s_timespec nsecs, UProcess.s_timespec remain) throws UErrorException;
	/**
		Calls sleep.
		<p>
		<font size="-1"><b><i>Click {@link <a href="doc-files/synopses.html#sleep">here</a>} for Posix/SUS C API.</i></b></font>
	*/
	public static native int sleep(int secs);
	/**
		Calls usleep.
		<p>
		<font size="-1"><b><i>Click {@link <a href="doc-files/synopses.html#usleep">here</a>} for Posix/SUS C API.</i></b></font>
	*/
	public static native void usleep(int usecs) throws UErrorException;
}
