// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.blueprint.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The status of the blueprint. This field is readonly.
 * 
 */
public final class BlueprintStatusResponse extends com.pulumi.resources.InvokeArgs {

    public static final BlueprintStatusResponse Empty = new BlueprintStatusResponse();

    /**
     * Last modified time of this blueprint definition.
     * 
     */
    @Import(name="lastModified", required=true)
    private String lastModified;

    /**
     * @return Last modified time of this blueprint definition.
     * 
     */
    public String lastModified() {
        return this.lastModified;
    }

    /**
     * Creation time of this blueprint definition.
     * 
     */
    @Import(name="timeCreated", required=true)
    private String timeCreated;

    /**
     * @return Creation time of this blueprint definition.
     * 
     */
    public String timeCreated() {
        return this.timeCreated;
    }

    private BlueprintStatusResponse() {}

    private BlueprintStatusResponse(BlueprintStatusResponse $) {
        this.lastModified = $.lastModified;
        this.timeCreated = $.timeCreated;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BlueprintStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BlueprintStatusResponse $;

        public Builder() {
            $ = new BlueprintStatusResponse();
        }

        public Builder(BlueprintStatusResponse defaults) {
            $ = new BlueprintStatusResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param lastModified Last modified time of this blueprint definition.
         * 
         * @return builder
         * 
         */
        public Builder lastModified(String lastModified) {
            $.lastModified = lastModified;
            return this;
        }

        /**
         * @param timeCreated Creation time of this blueprint definition.
         * 
         * @return builder
         * 
         */
        public Builder timeCreated(String timeCreated) {
            $.timeCreated = timeCreated;
            return this;
        }

        public BlueprintStatusResponse build() {
            $.lastModified = Objects.requireNonNull($.lastModified, "expected parameter 'lastModified' to be non-null");
            $.timeCreated = Objects.requireNonNull($.timeCreated, "expected parameter 'timeCreated' to be non-null");
            return $;
        }
    }

}
