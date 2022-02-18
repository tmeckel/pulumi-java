// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.run_v1.inputs.ExecActionArgs;
import io.pulumi.googlenative.run_v1.inputs.HTTPGetActionArgs;
import io.pulumi.googlenative.run_v1.inputs.TCPSocketActionArgs;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Not supported by Cloud Run Probe describes a health check to be performed against a container to determine whether it is alive or ready to receive traffic.
 * 
 */
public final class ProbeArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProbeArgs Empty = new ProbeArgs();

    /**
     * (Optional) One and only one of the following should be specified. Exec specifies the action to take. A field inlined from the Handler message.
     * 
     */
    @InputImport(name="exec")
    private final @Nullable Input<ExecActionArgs> exec;

    public Input<ExecActionArgs> getExec() {
        return this.exec == null ? Input.empty() : this.exec;
    }

    /**
     * (Optional) Minimum consecutive failures for the probe to be considered failed after having succeeded. Defaults to 3. Minimum value is 1.
     * 
     */
    @InputImport(name="failureThreshold")
    private final @Nullable Input<Integer> failureThreshold;

    public Input<Integer> getFailureThreshold() {
        return this.failureThreshold == null ? Input.empty() : this.failureThreshold;
    }

    /**
     * (Optional) HTTPGet specifies the http request to perform. A field inlined from the Handler message.
     * 
     */
    @InputImport(name="httpGet")
    private final @Nullable Input<HTTPGetActionArgs> httpGet;

    public Input<HTTPGetActionArgs> getHttpGet() {
        return this.httpGet == null ? Input.empty() : this.httpGet;
    }

    /**
     * (Optional) Number of seconds after the container has started before liveness probes are initiated. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     * 
     */
    @InputImport(name="initialDelaySeconds")
    private final @Nullable Input<Integer> initialDelaySeconds;

    public Input<Integer> getInitialDelaySeconds() {
        return this.initialDelaySeconds == null ? Input.empty() : this.initialDelaySeconds;
    }

    /**
     * (Optional) How often (in seconds) to perform the probe. Default to 10 seconds. Minimum value is 1.
     * 
     */
    @InputImport(name="periodSeconds")
    private final @Nullable Input<Integer> periodSeconds;

    public Input<Integer> getPeriodSeconds() {
        return this.periodSeconds == null ? Input.empty() : this.periodSeconds;
    }

    /**
     * (Optional) Minimum consecutive successes for the probe to be considered successful after having failed. Defaults to 1. Must be 1 for liveness. Minimum value is 1.
     * 
     */
    @InputImport(name="successThreshold")
    private final @Nullable Input<Integer> successThreshold;

    public Input<Integer> getSuccessThreshold() {
        return this.successThreshold == null ? Input.empty() : this.successThreshold;
    }

    /**
     * (Optional) TCPSocket specifies an action involving a TCP port. TCP hooks not yet supported A field inlined from the Handler message.
     * 
     */
    @InputImport(name="tcpSocket")
    private final @Nullable Input<TCPSocketActionArgs> tcpSocket;

    public Input<TCPSocketActionArgs> getTcpSocket() {
        return this.tcpSocket == null ? Input.empty() : this.tcpSocket;
    }

    /**
     * (Optional) Number of seconds after which the probe times out. Defaults to 1 second. Minimum value is 1. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     * 
     */
    @InputImport(name="timeoutSeconds")
    private final @Nullable Input<Integer> timeoutSeconds;

    public Input<Integer> getTimeoutSeconds() {
        return this.timeoutSeconds == null ? Input.empty() : this.timeoutSeconds;
    }

    public ProbeArgs(
        @Nullable Input<ExecActionArgs> exec,
        @Nullable Input<Integer> failureThreshold,
        @Nullable Input<HTTPGetActionArgs> httpGet,
        @Nullable Input<Integer> initialDelaySeconds,
        @Nullable Input<Integer> periodSeconds,
        @Nullable Input<Integer> successThreshold,
        @Nullable Input<TCPSocketActionArgs> tcpSocket,
        @Nullable Input<Integer> timeoutSeconds) {
        this.exec = exec;
        this.failureThreshold = failureThreshold;
        this.httpGet = httpGet;
        this.initialDelaySeconds = initialDelaySeconds;
        this.periodSeconds = periodSeconds;
        this.successThreshold = successThreshold;
        this.tcpSocket = tcpSocket;
        this.timeoutSeconds = timeoutSeconds;
    }

    private ProbeArgs() {
        this.exec = Input.empty();
        this.failureThreshold = Input.empty();
        this.httpGet = Input.empty();
        this.initialDelaySeconds = Input.empty();
        this.periodSeconds = Input.empty();
        this.successThreshold = Input.empty();
        this.tcpSocket = Input.empty();
        this.timeoutSeconds = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProbeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ExecActionArgs> exec;
        private @Nullable Input<Integer> failureThreshold;
        private @Nullable Input<HTTPGetActionArgs> httpGet;
        private @Nullable Input<Integer> initialDelaySeconds;
        private @Nullable Input<Integer> periodSeconds;
        private @Nullable Input<Integer> successThreshold;
        private @Nullable Input<TCPSocketActionArgs> tcpSocket;
        private @Nullable Input<Integer> timeoutSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(ProbeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exec = defaults.exec;
    	      this.failureThreshold = defaults.failureThreshold;
    	      this.httpGet = defaults.httpGet;
    	      this.initialDelaySeconds = defaults.initialDelaySeconds;
    	      this.periodSeconds = defaults.periodSeconds;
    	      this.successThreshold = defaults.successThreshold;
    	      this.tcpSocket = defaults.tcpSocket;
    	      this.timeoutSeconds = defaults.timeoutSeconds;
        }

        public Builder setExec(@Nullable Input<ExecActionArgs> exec) {
            this.exec = exec;
            return this;
        }

        public Builder setExec(@Nullable ExecActionArgs exec) {
            this.exec = Input.ofNullable(exec);
            return this;
        }

        public Builder setFailureThreshold(@Nullable Input<Integer> failureThreshold) {
            this.failureThreshold = failureThreshold;
            return this;
        }

        public Builder setFailureThreshold(@Nullable Integer failureThreshold) {
            this.failureThreshold = Input.ofNullable(failureThreshold);
            return this;
        }

        public Builder setHttpGet(@Nullable Input<HTTPGetActionArgs> httpGet) {
            this.httpGet = httpGet;
            return this;
        }

        public Builder setHttpGet(@Nullable HTTPGetActionArgs httpGet) {
            this.httpGet = Input.ofNullable(httpGet);
            return this;
        }

        public Builder setInitialDelaySeconds(@Nullable Input<Integer> initialDelaySeconds) {
            this.initialDelaySeconds = initialDelaySeconds;
            return this;
        }

        public Builder setInitialDelaySeconds(@Nullable Integer initialDelaySeconds) {
            this.initialDelaySeconds = Input.ofNullable(initialDelaySeconds);
            return this;
        }

        public Builder setPeriodSeconds(@Nullable Input<Integer> periodSeconds) {
            this.periodSeconds = periodSeconds;
            return this;
        }

        public Builder setPeriodSeconds(@Nullable Integer periodSeconds) {
            this.periodSeconds = Input.ofNullable(periodSeconds);
            return this;
        }

        public Builder setSuccessThreshold(@Nullable Input<Integer> successThreshold) {
            this.successThreshold = successThreshold;
            return this;
        }

        public Builder setSuccessThreshold(@Nullable Integer successThreshold) {
            this.successThreshold = Input.ofNullable(successThreshold);
            return this;
        }

        public Builder setTcpSocket(@Nullable Input<TCPSocketActionArgs> tcpSocket) {
            this.tcpSocket = tcpSocket;
            return this;
        }

        public Builder setTcpSocket(@Nullable TCPSocketActionArgs tcpSocket) {
            this.tcpSocket = Input.ofNullable(tcpSocket);
            return this;
        }

        public Builder setTimeoutSeconds(@Nullable Input<Integer> timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }

        public Builder setTimeoutSeconds(@Nullable Integer timeoutSeconds) {
            this.timeoutSeconds = Input.ofNullable(timeoutSeconds);
            return this;
        }

        public ProbeArgs build() {
            return new ProbeArgs(exec, failureThreshold, httpGet, initialDelaySeconds, periodSeconds, successThreshold, tcpSocket, timeoutSeconds);
        }
    }
}
