// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The registry node that generated the event. Put differently, while the actor initiates the event, the source generates it.
 * 
 */
public final class SourceResponse extends io.pulumi.resources.InvokeArgs {

    public static final SourceResponse Empty = new SourceResponse();

    /**
     * The IP or hostname and the port of the registry node that generated the event. Generally, this will be resolved by os.Hostname() along with the running port.
     * 
     */
    @InputImport(name="addr")
      private final @Nullable String addr;

    public Optional<String> getAddr() {
        return this.addr == null ? Optional.empty() : Optional.ofNullable(this.addr);
    }

    /**
     * The running instance of an application. Changes after each restart.
     * 
     */
    @InputImport(name="instanceID")
      private final @Nullable String instanceID;

    public Optional<String> getInstanceID() {
        return this.instanceID == null ? Optional.empty() : Optional.ofNullable(this.instanceID);
    }

    public SourceResponse(
        @Nullable String addr,
        @Nullable String instanceID) {
        this.addr = addr;
        this.instanceID = instanceID;
    }

    private SourceResponse() {
        this.addr = null;
        this.instanceID = null;
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
