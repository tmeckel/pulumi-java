// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SourceResponse {
    /**
     * The IP or hostname and the port of the registry node that generated the event. Generally, this will be resolved by os.Hostname() along with the running port.
     * 
     */
    private final @Nullable String addr;
    /**
     * The running instance of an application. Changes after each restart.
     * 
     */
    private final @Nullable String instanceID;

    @OutputCustomType.Constructor
    private SourceResponse(
        @OutputCustomType.Parameter("addr") @Nullable String addr,
        @OutputCustomType.Parameter("instanceID") @Nullable String instanceID) {
        this.addr = addr;
        this.instanceID = instanceID;
    }

    /**
     * The IP or hostname and the port of the registry node that generated the event. Generally, this will be resolved by os.Hostname() along with the running port.
     * 
    */
    public Optional<String> getAddr() {
        return Optional.ofNullable(this.addr);
    }
    /**
     * The running instance of an application. Changes after each restart.
     * 
    */
    public Optional<String> getInstanceID() {
        return Optional.ofNullable(this.instanceID);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String addr;
        private @Nullable String instanceID;

        public Builder() {
    	      // Empty
        }

        public Builder(SourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addr = defaults.addr;
    	      this.instanceID = defaults.instanceID;
        }

        public Builder addr(@Nullable String addr) {
            this.addr = addr;
            return this;
        }

        public Builder instanceID(@Nullable String instanceID) {
            this.instanceID = instanceID;
            return this;
        }
        public SourceResponse build() {
            return new SourceResponse(addr, instanceID);
        }
    }
}
