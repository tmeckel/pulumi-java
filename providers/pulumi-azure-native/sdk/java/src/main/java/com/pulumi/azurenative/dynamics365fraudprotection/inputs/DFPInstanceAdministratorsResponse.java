// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.dynamics365fraudprotection.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An array of administrator user identities
 * 
 */
public final class DFPInstanceAdministratorsResponse extends com.pulumi.resources.InvokeArgs {

    public static final DFPInstanceAdministratorsResponse Empty = new DFPInstanceAdministratorsResponse();

    /**
     * An array of administrator user identities.
     * 
     */
    @Import(name="members")
    private @Nullable List<String> members;

    /**
     * @return An array of administrator user identities.
     * 
     */
    public Optional<List<String>> members() {
        return Optional.ofNullable(this.members);
    }

    private DFPInstanceAdministratorsResponse() {}

    private DFPInstanceAdministratorsResponse(DFPInstanceAdministratorsResponse $) {
        this.members = $.members;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DFPInstanceAdministratorsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DFPInstanceAdministratorsResponse $;

        public Builder() {
            $ = new DFPInstanceAdministratorsResponse();
        }

        public Builder(DFPInstanceAdministratorsResponse defaults) {
            $ = new DFPInstanceAdministratorsResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param members An array of administrator user identities.
         * 
         * @return builder
         * 
         */
        public Builder members(@Nullable List<String> members) {
            $.members = members;
            return this;
        }

        /**
         * @param members An array of administrator user identities.
         * 
         * @return builder
         * 
         */
        public Builder members(String... members) {
            return members(List.of(members));
        }

        public DFPInstanceAdministratorsResponse build() {
            return $;
        }
    }

}
