// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.deploymentmanager_alpha;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.deploymentmanager_alpha.enums.CompositeTypeStatus;
import com.pulumi.googlenative.deploymentmanager_alpha.inputs.CompositeTypeLabelEntryArgs;
import com.pulumi.googlenative.deploymentmanager_alpha.inputs.TemplateContentsArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CompositeTypeArgs extends com.pulumi.resources.ResourceArgs {

    public static final CompositeTypeArgs Empty = new CompositeTypeArgs();

    /**
     * An optional textual description of the resource; provided by the client when the resource is created.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return An optional textual description of the resource; provided by the client when the resource is created.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    @Import(name="id")
    private @Nullable Output<String> id;

    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Map of labels; provided by the client when the resource is created or updated. Specifically: Label keys must be between 1 and 63 characters long and must conform to the following regular expression: `[a-z]([-a-z0-9]*[a-z0-9])?` Label values must be between 0 and 63 characters long and must conform to the regular expression `([a-z]([-a-z0-9]*[a-z0-9])?)?`.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<List<CompositeTypeLabelEntryArgs>> labels;

    /**
     * @return Map of labels; provided by the client when the resource is created or updated. Specifically: Label keys must be between 1 and 63 characters long and must conform to the following regular expression: `[a-z]([-a-z0-9]*[a-z0-9])?` Label values must be between 0 and 63 characters long and must conform to the regular expression `([a-z]([-a-z0-9]*[a-z0-9])?)?`.
     * 
     */
    public Optional<Output<List<CompositeTypeLabelEntryArgs>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * Name of the composite type, must follow the expression: `[a-z]([-a-z0-9_.]{0,61}[a-z0-9])?`.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the composite type, must follow the expression: `[a-z]([-a-z0-9_.]{0,61}[a-z0-9])?`.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="status")
    private @Nullable Output<CompositeTypeStatus> status;

    public Optional<Output<CompositeTypeStatus>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * Files for the template type.
     * 
     */
    @Import(name="templateContents")
    private @Nullable Output<TemplateContentsArgs> templateContents;

    /**
     * @return Files for the template type.
     * 
     */
    public Optional<Output<TemplateContentsArgs>> templateContents() {
        return Optional.ofNullable(this.templateContents);
    }

    private CompositeTypeArgs() {}

    private CompositeTypeArgs(CompositeTypeArgs $) {
        this.description = $.description;
        this.id = $.id;
        this.labels = $.labels;
        this.name = $.name;
        this.project = $.project;
        this.status = $.status;
        this.templateContents = $.templateContents;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CompositeTypeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CompositeTypeArgs $;

        public Builder() {
            $ = new CompositeTypeArgs();
        }

        public Builder(CompositeTypeArgs defaults) {
            $ = new CompositeTypeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description An optional textual description of the resource; provided by the client when the resource is created.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description An optional textual description of the resource; provided by the client when the resource is created.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param labels Map of labels; provided by the client when the resource is created or updated. Specifically: Label keys must be between 1 and 63 characters long and must conform to the following regular expression: `[a-z]([-a-z0-9]*[a-z0-9])?` Label values must be between 0 and 63 characters long and must conform to the regular expression `([a-z]([-a-z0-9]*[a-z0-9])?)?`.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<List<CompositeTypeLabelEntryArgs>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Map of labels; provided by the client when the resource is created or updated. Specifically: Label keys must be between 1 and 63 characters long and must conform to the following regular expression: `[a-z]([-a-z0-9]*[a-z0-9])?` Label values must be between 0 and 63 characters long and must conform to the regular expression `([a-z]([-a-z0-9]*[a-z0-9])?)?`.
         * 
         * @return builder
         * 
         */
        public Builder labels(List<CompositeTypeLabelEntryArgs> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param labels Map of labels; provided by the client when the resource is created or updated. Specifically: Label keys must be between 1 and 63 characters long and must conform to the following regular expression: `[a-z]([-a-z0-9]*[a-z0-9])?` Label values must be between 0 and 63 characters long and must conform to the regular expression `([a-z]([-a-z0-9]*[a-z0-9])?)?`.
         * 
         * @return builder
         * 
         */
        public Builder labels(CompositeTypeLabelEntryArgs... labels) {
            return labels(List.of(labels));
        }

        /**
         * @param name Name of the composite type, must follow the expression: `[a-z]([-a-z0-9_.]{0,61}[a-z0-9])?`.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the composite type, must follow the expression: `[a-z]([-a-z0-9_.]{0,61}[a-z0-9])?`.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder status(@Nullable Output<CompositeTypeStatus> status) {
            $.status = status;
            return this;
        }

        public Builder status(CompositeTypeStatus status) {
            return status(Output.of(status));
        }

        /**
         * @param templateContents Files for the template type.
         * 
         * @return builder
         * 
         */
        public Builder templateContents(@Nullable Output<TemplateContentsArgs> templateContents) {
            $.templateContents = templateContents;
            return this;
        }

        /**
         * @param templateContents Files for the template type.
         * 
         * @return builder
         * 
         */
        public Builder templateContents(TemplateContentsArgs templateContents) {
            return templateContents(Output.of(templateContents));
        }

        public CompositeTypeArgs build() {
            return $;
        }
    }

}
