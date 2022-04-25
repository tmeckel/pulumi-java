// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.security.inputs;

import com.pulumi.azurenative.security.inputs.DefenderForServersAwsOfferingResponseArcAutoProvisioning;
import com.pulumi.azurenative.security.inputs.DefenderForServersAwsOfferingResponseDefenderForServers;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The Defender for Servers AWS offering configurations
 * 
 */
public final class DefenderForServersAwsOfferingResponse extends com.pulumi.resources.InvokeArgs {

    public static final DefenderForServersAwsOfferingResponse Empty = new DefenderForServersAwsOfferingResponse();

    /**
     * The ARC autoprovisioning configuration
     * 
     */
    @Import(name="arcAutoProvisioning")
    private @Nullable DefenderForServersAwsOfferingResponseArcAutoProvisioning arcAutoProvisioning;

    /**
     * @return The ARC autoprovisioning configuration
     * 
     */
    public Optional<DefenderForServersAwsOfferingResponseArcAutoProvisioning> arcAutoProvisioning() {
        return Optional.ofNullable(this.arcAutoProvisioning);
    }

    /**
     * The Defender for servers connection configuration
     * 
     */
    @Import(name="defenderForServers")
    private @Nullable DefenderForServersAwsOfferingResponseDefenderForServers defenderForServers;

    /**
     * @return The Defender for servers connection configuration
     * 
     */
    public Optional<DefenderForServersAwsOfferingResponseDefenderForServers> defenderForServers() {
        return Optional.ofNullable(this.defenderForServers);
    }

    /**
     * The offering description.
     * 
     */
    @Import(name="description", required=true)
    private String description;

    /**
     * @return The offering description.
     * 
     */
    public String description() {
        return this.description;
    }

    /**
     * The type of the security offering.
     * Expected value is &#39;DefenderForServersAWS&#39;.
     * 
     */
    @Import(name="offeringType", required=true)
    private String offeringType;

    /**
     * @return The type of the security offering.
     * Expected value is &#39;DefenderForServersAWS&#39;.
     * 
     */
    public String offeringType() {
        return this.offeringType;
    }

    private DefenderForServersAwsOfferingResponse() {}

    private DefenderForServersAwsOfferingResponse(DefenderForServersAwsOfferingResponse $) {
        this.arcAutoProvisioning = $.arcAutoProvisioning;
        this.defenderForServers = $.defenderForServers;
        this.description = $.description;
        this.offeringType = $.offeringType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DefenderForServersAwsOfferingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DefenderForServersAwsOfferingResponse $;

        public Builder() {
            $ = new DefenderForServersAwsOfferingResponse();
        }

        public Builder(DefenderForServersAwsOfferingResponse defaults) {
            $ = new DefenderForServersAwsOfferingResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param arcAutoProvisioning The ARC autoprovisioning configuration
         * 
         * @return builder
         * 
         */
        public Builder arcAutoProvisioning(@Nullable DefenderForServersAwsOfferingResponseArcAutoProvisioning arcAutoProvisioning) {
            $.arcAutoProvisioning = arcAutoProvisioning;
            return this;
        }

        /**
         * @param defenderForServers The Defender for servers connection configuration
         * 
         * @return builder
         * 
         */
        public Builder defenderForServers(@Nullable DefenderForServersAwsOfferingResponseDefenderForServers defenderForServers) {
            $.defenderForServers = defenderForServers;
            return this;
        }

        /**
         * @param description The offering description.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            $.description = description;
            return this;
        }

        /**
         * @param offeringType The type of the security offering.
         * Expected value is &#39;DefenderForServersAWS&#39;.
         * 
         * @return builder
         * 
         */
        public Builder offeringType(String offeringType) {
            $.offeringType = offeringType;
            return this;
        }

        public DefenderForServersAwsOfferingResponse build() {
            $.description = Objects.requireNonNull($.description, "expected parameter 'description' to be non-null");
            $.offeringType = Codegen.stringProp("offeringType").arg($.offeringType).require();
            return $;
        }
    }

}
