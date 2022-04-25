// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.azurenative.recoveryservices.inputs.HealthErrorResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Push installer details.
 * 
 */
public final class PushInstallerDetailsResponse extends com.pulumi.resources.InvokeArgs {

    public static final PushInstallerDetailsResponse Empty = new PushInstallerDetailsResponse();

    /**
     * The health of the push installer.
     * 
     */
    @Import(name="health", required=true)
    private String health;

    /**
     * @return The health of the push installer.
     * 
     */
    public String health() {
        return this.health;
    }

    /**
     * The health errors.
     * 
     */
    @Import(name="healthErrors", required=true)
    private List<HealthErrorResponse> healthErrors;

    /**
     * @return The health errors.
     * 
     */
    public List<HealthErrorResponse> healthErrors() {
        return this.healthErrors;
    }

    /**
     * The push installer Id.
     * 
     */
    @Import(name="id", required=true)
    private String id;

    /**
     * @return The push installer Id.
     * 
     */
    public String id() {
        return this.id;
    }

    /**
     * The last heartbeat received from the push installer.
     * 
     */
    @Import(name="lastHeartbeatUtc", required=true)
    private String lastHeartbeatUtc;

    /**
     * @return The last heartbeat received from the push installer.
     * 
     */
    public String lastHeartbeatUtc() {
        return this.lastHeartbeatUtc;
    }

    /**
     * The push installer name.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The push installer name.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The push installer version.
     * 
     */
    @Import(name="version", required=true)
    private String version;

    /**
     * @return The push installer version.
     * 
     */
    public String version() {
        return this.version;
    }

    private PushInstallerDetailsResponse() {}

    private PushInstallerDetailsResponse(PushInstallerDetailsResponse $) {
        this.health = $.health;
        this.healthErrors = $.healthErrors;
        this.id = $.id;
        this.lastHeartbeatUtc = $.lastHeartbeatUtc;
        this.name = $.name;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PushInstallerDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PushInstallerDetailsResponse $;

        public Builder() {
            $ = new PushInstallerDetailsResponse();
        }

        public Builder(PushInstallerDetailsResponse defaults) {
            $ = new PushInstallerDetailsResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param health The health of the push installer.
         * 
         * @return builder
         * 
         */
        public Builder health(String health) {
            $.health = health;
            return this;
        }

        /**
         * @param healthErrors The health errors.
         * 
         * @return builder
         * 
         */
        public Builder healthErrors(List<HealthErrorResponse> healthErrors) {
            $.healthErrors = healthErrors;
            return this;
        }

        /**
         * @param healthErrors The health errors.
         * 
         * @return builder
         * 
         */
        public Builder healthErrors(HealthErrorResponse... healthErrors) {
            return healthErrors(List.of(healthErrors));
        }

        /**
         * @param id The push installer Id.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            $.id = id;
            return this;
        }

        /**
         * @param lastHeartbeatUtc The last heartbeat received from the push installer.
         * 
         * @return builder
         * 
         */
        public Builder lastHeartbeatUtc(String lastHeartbeatUtc) {
            $.lastHeartbeatUtc = lastHeartbeatUtc;
            return this;
        }

        /**
         * @param name The push installer name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param version The push installer version.
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            $.version = version;
            return this;
        }

        public PushInstallerDetailsResponse build() {
            $.health = Objects.requireNonNull($.health, "expected parameter 'health' to be non-null");
            $.healthErrors = Objects.requireNonNull($.healthErrors, "expected parameter 'healthErrors' to be non-null");
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            $.lastHeartbeatUtc = Objects.requireNonNull($.lastHeartbeatUtc, "expected parameter 'lastHeartbeatUtc' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.version = Objects.requireNonNull($.version, "expected parameter 'version' to be non-null");
            return $;
        }
    }

}
