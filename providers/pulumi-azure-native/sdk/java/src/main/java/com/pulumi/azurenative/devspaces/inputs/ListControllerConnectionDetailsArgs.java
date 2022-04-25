// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.devspaces.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ListControllerConnectionDetailsArgs extends com.pulumi.resources.InvokeArgs {

    public static final ListControllerConnectionDetailsArgs Empty = new ListControllerConnectionDetailsArgs();

    /**
     * Name of the resource.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return Name of the resource.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * Resource group to which the resource belongs.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return Resource group to which the resource belongs.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Resource ID of the target container host mapped to the Azure Dev Spaces Controller.
     * 
     */
    @Import(name="targetContainerHostResourceId", required=true)
    private String targetContainerHostResourceId;

    /**
     * @return Resource ID of the target container host mapped to the Azure Dev Spaces Controller.
     * 
     */
    public String targetContainerHostResourceId() {
        return this.targetContainerHostResourceId;
    }

    private ListControllerConnectionDetailsArgs() {}

    private ListControllerConnectionDetailsArgs(ListControllerConnectionDetailsArgs $) {
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.targetContainerHostResourceId = $.targetContainerHostResourceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListControllerConnectionDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListControllerConnectionDetailsArgs $;

        public Builder() {
            $ = new ListControllerConnectionDetailsArgs();
        }

        public Builder(ListControllerConnectionDetailsArgs defaults) {
            $ = new ListControllerConnectionDetailsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Name of the resource.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param resourceGroupName Resource group to which the resource belongs.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param targetContainerHostResourceId Resource ID of the target container host mapped to the Azure Dev Spaces Controller.
         * 
         * @return builder
         * 
         */
        public Builder targetContainerHostResourceId(String targetContainerHostResourceId) {
            $.targetContainerHostResourceId = targetContainerHostResourceId;
            return this;
        }

        public ListControllerConnectionDetailsArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.targetContainerHostResourceId = Objects.requireNonNull($.targetContainerHostResourceId, "expected parameter 'targetContainerHostResourceId' to be non-null");
            return $;
        }
    }

}
