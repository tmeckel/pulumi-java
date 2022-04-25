// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebAppDeploymentArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAppDeploymentArgs Empty = new WebAppDeploymentArgs();

    /**
     * True if deployment is currently active, false if completed and null if not started.
     * 
     */
    @Import(name="active")
    private @Nullable Output<Boolean> active;

    /**
     * @return True if deployment is currently active, false if completed and null if not started.
     * 
     */
    public Optional<Output<Boolean>> active() {
        return Optional.ofNullable(this.active);
    }

    /**
     * Who authored the deployment.
     * 
     */
    @Import(name="author")
    private @Nullable Output<String> author;

    /**
     * @return Who authored the deployment.
     * 
     */
    public Optional<Output<String>> author() {
        return Optional.ofNullable(this.author);
    }

    /**
     * Author email.
     * 
     */
    @Import(name="authorEmail")
    private @Nullable Output<String> authorEmail;

    /**
     * @return Author email.
     * 
     */
    public Optional<Output<String>> authorEmail() {
        return Optional.ofNullable(this.authorEmail);
    }

    /**
     * Who performed the deployment.
     * 
     */
    @Import(name="deployer")
    private @Nullable Output<String> deployer;

    /**
     * @return Who performed the deployment.
     * 
     */
    public Optional<Output<String>> deployer() {
        return Optional.ofNullable(this.deployer);
    }

    /**
     * Details on deployment.
     * 
     */
    @Import(name="details")
    private @Nullable Output<String> details;

    /**
     * @return Details on deployment.
     * 
     */
    public Optional<Output<String>> details() {
        return Optional.ofNullable(this.details);
    }

    /**
     * End time.
     * 
     */
    @Import(name="endTime")
    private @Nullable Output<String> endTime;

    /**
     * @return End time.
     * 
     */
    public Optional<Output<String>> endTime() {
        return Optional.ofNullable(this.endTime);
    }

    /**
     * ID of an existing deployment.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return ID of an existing deployment.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Kind of resource.
     * 
     */
    @Import(name="kind")
    private @Nullable Output<String> kind;

    /**
     * @return Kind of resource.
     * 
     */
    public Optional<Output<String>> kind() {
        return Optional.ofNullable(this.kind);
    }

    /**
     * Details about deployment status.
     * 
     */
    @Import(name="message")
    private @Nullable Output<String> message;

    /**
     * @return Details about deployment status.
     * 
     */
    public Optional<Output<String>> message() {
        return Optional.ofNullable(this.message);
    }

    /**
     * Name of the app.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Name of the app.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Name of the resource group to which the resource belongs.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return Name of the resource group to which the resource belongs.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Start time.
     * 
     */
    @Import(name="startTime")
    private @Nullable Output<String> startTime;

    /**
     * @return Start time.
     * 
     */
    public Optional<Output<String>> startTime() {
        return Optional.ofNullable(this.startTime);
    }

    /**
     * Deployment status.
     * 
     */
    @Import(name="status")
    private @Nullable Output<Integer> status;

    /**
     * @return Deployment status.
     * 
     */
    public Optional<Output<Integer>> status() {
        return Optional.ofNullable(this.status);
    }

    private WebAppDeploymentArgs() {}

    private WebAppDeploymentArgs(WebAppDeploymentArgs $) {
        this.active = $.active;
        this.author = $.author;
        this.authorEmail = $.authorEmail;
        this.deployer = $.deployer;
        this.details = $.details;
        this.endTime = $.endTime;
        this.id = $.id;
        this.kind = $.kind;
        this.message = $.message;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.startTime = $.startTime;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAppDeploymentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAppDeploymentArgs $;

        public Builder() {
            $ = new WebAppDeploymentArgs();
        }

        public Builder(WebAppDeploymentArgs defaults) {
            $ = new WebAppDeploymentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param active True if deployment is currently active, false if completed and null if not started.
         * 
         * @return builder
         * 
         */
        public Builder active(@Nullable Output<Boolean> active) {
            $.active = active;
            return this;
        }

        /**
         * @param active True if deployment is currently active, false if completed and null if not started.
         * 
         * @return builder
         * 
         */
        public Builder active(Boolean active) {
            return active(Output.of(active));
        }

        /**
         * @param author Who authored the deployment.
         * 
         * @return builder
         * 
         */
        public Builder author(@Nullable Output<String> author) {
            $.author = author;
            return this;
        }

        /**
         * @param author Who authored the deployment.
         * 
         * @return builder
         * 
         */
        public Builder author(String author) {
            return author(Output.of(author));
        }

        /**
         * @param authorEmail Author email.
         * 
         * @return builder
         * 
         */
        public Builder authorEmail(@Nullable Output<String> authorEmail) {
            $.authorEmail = authorEmail;
            return this;
        }

        /**
         * @param authorEmail Author email.
         * 
         * @return builder
         * 
         */
        public Builder authorEmail(String authorEmail) {
            return authorEmail(Output.of(authorEmail));
        }

        /**
         * @param deployer Who performed the deployment.
         * 
         * @return builder
         * 
         */
        public Builder deployer(@Nullable Output<String> deployer) {
            $.deployer = deployer;
            return this;
        }

        /**
         * @param deployer Who performed the deployment.
         * 
         * @return builder
         * 
         */
        public Builder deployer(String deployer) {
            return deployer(Output.of(deployer));
        }

        /**
         * @param details Details on deployment.
         * 
         * @return builder
         * 
         */
        public Builder details(@Nullable Output<String> details) {
            $.details = details;
            return this;
        }

        /**
         * @param details Details on deployment.
         * 
         * @return builder
         * 
         */
        public Builder details(String details) {
            return details(Output.of(details));
        }

        /**
         * @param endTime End time.
         * 
         * @return builder
         * 
         */
        public Builder endTime(@Nullable Output<String> endTime) {
            $.endTime = endTime;
            return this;
        }

        /**
         * @param endTime End time.
         * 
         * @return builder
         * 
         */
        public Builder endTime(String endTime) {
            return endTime(Output.of(endTime));
        }

        /**
         * @param id ID of an existing deployment.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id ID of an existing deployment.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param kind Kind of resource.
         * 
         * @return builder
         * 
         */
        public Builder kind(@Nullable Output<String> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind Kind of resource.
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        /**
         * @param message Details about deployment status.
         * 
         * @return builder
         * 
         */
        public Builder message(@Nullable Output<String> message) {
            $.message = message;
            return this;
        }

        /**
         * @param message Details about deployment status.
         * 
         * @return builder
         * 
         */
        public Builder message(String message) {
            return message(Output.of(message));
        }

        /**
         * @param name Name of the app.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the app.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName Name of the resource group to which the resource belongs.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName Name of the resource group to which the resource belongs.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param startTime Start time.
         * 
         * @return builder
         * 
         */
        public Builder startTime(@Nullable Output<String> startTime) {
            $.startTime = startTime;
            return this;
        }

        /**
         * @param startTime Start time.
         * 
         * @return builder
         * 
         */
        public Builder startTime(String startTime) {
            return startTime(Output.of(startTime));
        }

        /**
         * @param status Deployment status.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<Integer> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Deployment status.
         * 
         * @return builder
         * 
         */
        public Builder status(Integer status) {
            return status(Output.of(status));
        }

        public WebAppDeploymentArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
