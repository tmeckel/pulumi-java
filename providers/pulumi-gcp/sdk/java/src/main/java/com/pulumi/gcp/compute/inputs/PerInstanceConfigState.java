// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.compute.inputs.PerInstanceConfigPreservedStateGetArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PerInstanceConfigState extends com.pulumi.resources.ResourceArgs {

    public static final PerInstanceConfigState Empty = new PerInstanceConfigState();

    /**
     * The instance group manager this instance config is part of.
     * 
     */
    @Import(name="instanceGroupManager")
    private @Nullable Output<String> instanceGroupManager;

    /**
     * @return The instance group manager this instance config is part of.
     * 
     */
    public Optional<Output<String>> instanceGroupManager() {
        return Optional.ofNullable(this.instanceGroupManager);
    }

    /**
     * The minimal action to perform on the instance during an update.
     * Default is `NONE`. Possible values are:
     * * REPLACE
     * * RESTART
     * * REFRESH
     * * NONE
     * 
     */
    @Import(name="minimalAction")
    private @Nullable Output<String> minimalAction;

    /**
     * @return The minimal action to perform on the instance during an update.
     * Default is `NONE`. Possible values are:
     * * REPLACE
     * * RESTART
     * * REFRESH
     * * NONE
     * 
     */
    public Optional<Output<String>> minimalAction() {
        return Optional.ofNullable(this.minimalAction);
    }

    /**
     * The most disruptive action to perform on the instance during an update.
     * Default is `REPLACE`. Possible values are:
     * * REPLACE
     * * RESTART
     * * REFRESH
     * * NONE
     * 
     */
    @Import(name="mostDisruptiveAllowedAction")
    private @Nullable Output<String> mostDisruptiveAllowedAction;

    /**
     * @return The most disruptive action to perform on the instance during an update.
     * Default is `REPLACE`. Possible values are:
     * * REPLACE
     * * RESTART
     * * REFRESH
     * * NONE
     * 
     */
    public Optional<Output<String>> mostDisruptiveAllowedAction() {
        return Optional.ofNullable(this.mostDisruptiveAllowedAction);
    }

    /**
     * The name for this per-instance config and its corresponding instance.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name for this per-instance config and its corresponding instance.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The preserved state for this instance.
     * Structure is documented below.
     * 
     */
    @Import(name="preservedState")
    private @Nullable Output<PerInstanceConfigPreservedStateGetArgs> preservedState;

    /**
     * @return The preserved state for this instance.
     * Structure is documented below.
     * 
     */
    public Optional<Output<PerInstanceConfigPreservedStateGetArgs>> preservedState() {
        return Optional.ofNullable(this.preservedState);
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * When true, deleting this config will immediately remove any specified state from the underlying instance.
     * When false, deleting this config will *not* immediately remove any state from the underlying instance.
     * State will be removed on the next instance recreation or update.
     * 
     */
    @Import(name="removeInstanceStateOnDestroy")
    private @Nullable Output<Boolean> removeInstanceStateOnDestroy;

    /**
     * @return When true, deleting this config will immediately remove any specified state from the underlying instance.
     * When false, deleting this config will *not* immediately remove any state from the underlying instance.
     * State will be removed on the next instance recreation or update.
     * 
     */
    public Optional<Output<Boolean>> removeInstanceStateOnDestroy() {
        return Optional.ofNullable(this.removeInstanceStateOnDestroy);
    }

    /**
     * Zone where the containing instance group manager is located
     * 
     */
    @Import(name="zone")
    private @Nullable Output<String> zone;

    /**
     * @return Zone where the containing instance group manager is located
     * 
     */
    public Optional<Output<String>> zone() {
        return Optional.ofNullable(this.zone);
    }

    private PerInstanceConfigState() {}

    private PerInstanceConfigState(PerInstanceConfigState $) {
        this.instanceGroupManager = $.instanceGroupManager;
        this.minimalAction = $.minimalAction;
        this.mostDisruptiveAllowedAction = $.mostDisruptiveAllowedAction;
        this.name = $.name;
        this.preservedState = $.preservedState;
        this.project = $.project;
        this.removeInstanceStateOnDestroy = $.removeInstanceStateOnDestroy;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PerInstanceConfigState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PerInstanceConfigState $;

        public Builder() {
            $ = new PerInstanceConfigState();
        }

        public Builder(PerInstanceConfigState defaults) {
            $ = new PerInstanceConfigState(Objects.requireNonNull(defaults));
        }

        /**
         * @param instanceGroupManager The instance group manager this instance config is part of.
         * 
         * @return builder
         * 
         */
        public Builder instanceGroupManager(@Nullable Output<String> instanceGroupManager) {
            $.instanceGroupManager = instanceGroupManager;
            return this;
        }

        /**
         * @param instanceGroupManager The instance group manager this instance config is part of.
         * 
         * @return builder
         * 
         */
        public Builder instanceGroupManager(String instanceGroupManager) {
            return instanceGroupManager(Output.of(instanceGroupManager));
        }

        /**
         * @param minimalAction The minimal action to perform on the instance during an update.
         * Default is `NONE`. Possible values are:
         * * REPLACE
         * * RESTART
         * * REFRESH
         * * NONE
         * 
         * @return builder
         * 
         */
        public Builder minimalAction(@Nullable Output<String> minimalAction) {
            $.minimalAction = minimalAction;
            return this;
        }

        /**
         * @param minimalAction The minimal action to perform on the instance during an update.
         * Default is `NONE`. Possible values are:
         * * REPLACE
         * * RESTART
         * * REFRESH
         * * NONE
         * 
         * @return builder
         * 
         */
        public Builder minimalAction(String minimalAction) {
            return minimalAction(Output.of(minimalAction));
        }

        /**
         * @param mostDisruptiveAllowedAction The most disruptive action to perform on the instance during an update.
         * Default is `REPLACE`. Possible values are:
         * * REPLACE
         * * RESTART
         * * REFRESH
         * * NONE
         * 
         * @return builder
         * 
         */
        public Builder mostDisruptiveAllowedAction(@Nullable Output<String> mostDisruptiveAllowedAction) {
            $.mostDisruptiveAllowedAction = mostDisruptiveAllowedAction;
            return this;
        }

        /**
         * @param mostDisruptiveAllowedAction The most disruptive action to perform on the instance during an update.
         * Default is `REPLACE`. Possible values are:
         * * REPLACE
         * * RESTART
         * * REFRESH
         * * NONE
         * 
         * @return builder
         * 
         */
        public Builder mostDisruptiveAllowedAction(String mostDisruptiveAllowedAction) {
            return mostDisruptiveAllowedAction(Output.of(mostDisruptiveAllowedAction));
        }

        /**
         * @param name The name for this per-instance config and its corresponding instance.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name for this per-instance config and its corresponding instance.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param preservedState The preserved state for this instance.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder preservedState(@Nullable Output<PerInstanceConfigPreservedStateGetArgs> preservedState) {
            $.preservedState = preservedState;
            return this;
        }

        /**
         * @param preservedState The preserved state for this instance.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder preservedState(PerInstanceConfigPreservedStateGetArgs preservedState) {
            return preservedState(Output.of(preservedState));
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param removeInstanceStateOnDestroy When true, deleting this config will immediately remove any specified state from the underlying instance.
         * When false, deleting this config will *not* immediately remove any state from the underlying instance.
         * State will be removed on the next instance recreation or update.
         * 
         * @return builder
         * 
         */
        public Builder removeInstanceStateOnDestroy(@Nullable Output<Boolean> removeInstanceStateOnDestroy) {
            $.removeInstanceStateOnDestroy = removeInstanceStateOnDestroy;
            return this;
        }

        /**
         * @param removeInstanceStateOnDestroy When true, deleting this config will immediately remove any specified state from the underlying instance.
         * When false, deleting this config will *not* immediately remove any state from the underlying instance.
         * State will be removed on the next instance recreation or update.
         * 
         * @return builder
         * 
         */
        public Builder removeInstanceStateOnDestroy(Boolean removeInstanceStateOnDestroy) {
            return removeInstanceStateOnDestroy(Output.of(removeInstanceStateOnDestroy));
        }

        /**
         * @param zone Zone where the containing instance group manager is located
         * 
         * @return builder
         * 
         */
        public Builder zone(@Nullable Output<String> zone) {
            $.zone = zone;
            return this;
        }

        /**
         * @param zone Zone where the containing instance group manager is located
         * 
         * @return builder
         * 
         */
        public Builder zone(String zone) {
            return zone(Output.of(zone));
        }

        public PerInstanceConfigState build() {
            return $;
        }
    }

}
