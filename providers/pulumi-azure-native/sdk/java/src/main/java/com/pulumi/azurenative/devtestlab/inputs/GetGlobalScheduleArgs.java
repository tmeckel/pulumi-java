// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.devtestlab.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetGlobalScheduleArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetGlobalScheduleArgs Empty = new GetGlobalScheduleArgs();

    /**
     * Specify the $expand query. Example: &#39;properties($select=status)&#39;
     * 
     */
    @Import(name="expand")
    private @Nullable String expand;

    /**
     * @return Specify the $expand query. Example: &#39;properties($select=status)&#39;
     * 
     */
    public Optional<String> expand() {
        return Optional.ofNullable(this.expand);
    }

    /**
     * The name of the schedule.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the schedule.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetGlobalScheduleArgs() {}

    private GetGlobalScheduleArgs(GetGlobalScheduleArgs $) {
        this.expand = $.expand;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGlobalScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGlobalScheduleArgs $;

        public Builder() {
            $ = new GetGlobalScheduleArgs();
        }

        public Builder(GetGlobalScheduleArgs defaults) {
            $ = new GetGlobalScheduleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param expand Specify the $expand query. Example: &#39;properties($select=status)&#39;
         * 
         * @return builder
         * 
         */
        public Builder expand(@Nullable String expand) {
            $.expand = expand;
            return this;
        }

        /**
         * @param name The name of the schedule.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetGlobalScheduleArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
