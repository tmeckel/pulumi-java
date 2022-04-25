// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerregistry.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The registry node that generated the event. Put differently, while the actor initiates the event, the source generates it.
 * 
 */
public final class SourceResponse extends com.pulumi.resources.InvokeArgs {

    public static final SourceResponse Empty = new SourceResponse();

    /**
     * The IP or hostname and the port of the registry node that generated the event. Generally, this will be resolved by os.Hostname() along with the running port.
     * 
     */
    @Import(name="addr")
    private @Nullable String addr;

    /**
     * @return The IP or hostname and the port of the registry node that generated the event. Generally, this will be resolved by os.Hostname() along with the running port.
     * 
     */
    public Optional<String> addr() {
        return Optional.ofNullable(this.addr);
    }

    /**
     * The running instance of an application. Changes after each restart.
     * 
     */
    @Import(name="instanceID")
    private @Nullable String instanceID;

    /**
     * @return The running instance of an application. Changes after each restart.
     * 
     */
    public Optional<String> instanceID() {
        return Optional.ofNullable(this.instanceID);
    }

    private SourceResponse() {}

    private SourceResponse(SourceResponse $) {
        this.addr = $.addr;
        this.instanceID = $.instanceID;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SourceResponse $;

        public Builder() {
            $ = new SourceResponse();
        }

        public Builder(SourceResponse defaults) {
            $ = new SourceResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param addr The IP or hostname and the port of the registry node that generated the event. Generally, this will be resolved by os.Hostname() along with the running port.
         * 
         * @return builder
         * 
         */
        public Builder addr(@Nullable String addr) {
            $.addr = addr;
            return this;
        }

        /**
         * @param instanceID The running instance of an application. Changes after each restart.
         * 
         * @return builder
         * 
         */
        public Builder instanceID(@Nullable String instanceID) {
            $.instanceID = instanceID;
            return this;
        }

        public SourceResponse build() {
            return $;
        }
    }

}
