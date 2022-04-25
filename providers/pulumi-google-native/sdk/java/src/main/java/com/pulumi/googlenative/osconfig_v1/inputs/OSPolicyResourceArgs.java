// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.osconfig_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.osconfig_v1.inputs.OSPolicyResourceExecResourceArgs;
import com.pulumi.googlenative.osconfig_v1.inputs.OSPolicyResourceFileResourceArgs;
import com.pulumi.googlenative.osconfig_v1.inputs.OSPolicyResourcePackageResourceArgs;
import com.pulumi.googlenative.osconfig_v1.inputs.OSPolicyResourceRepositoryResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An OS policy resource is used to define the desired state configuration and provides a specific functionality like installing/removing packages, executing a script etc. The system ensures that resources are always in their desired state by taking necessary actions if they have drifted from their desired state.
 * 
 */
public final class OSPolicyResourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final OSPolicyResourceArgs Empty = new OSPolicyResourceArgs();

    /**
     * Exec resource
     * 
     */
    @Import(name="exec")
    private @Nullable Output<OSPolicyResourceExecResourceArgs> exec;

    /**
     * @return Exec resource
     * 
     */
    public Optional<Output<OSPolicyResourceExecResourceArgs>> exec() {
        return Optional.ofNullable(this.exec);
    }

    /**
     * File resource
     * 
     */
    @Import(name="file")
    private @Nullable Output<OSPolicyResourceFileResourceArgs> file;

    /**
     * @return File resource
     * 
     */
    public Optional<Output<OSPolicyResourceFileResourceArgs>> file() {
        return Optional.ofNullable(this.file);
    }

    /**
     * The id of the resource with the following restrictions: * Must contain only lowercase letters, numbers, and hyphens. * Must start with a letter. * Must be between 1-63 characters. * Must end with a number or a letter. * Must be unique within the OS policy.
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return The id of the resource with the following restrictions: * Must contain only lowercase letters, numbers, and hyphens. * Must start with a letter. * Must be between 1-63 characters. * Must end with a number or a letter. * Must be unique within the OS policy.
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    /**
     * Package resource
     * 
     */
    @Import(name="pkg")
    private @Nullable Output<OSPolicyResourcePackageResourceArgs> pkg;

    /**
     * @return Package resource
     * 
     */
    public Optional<Output<OSPolicyResourcePackageResourceArgs>> pkg() {
        return Optional.ofNullable(this.pkg);
    }

    /**
     * Package repository resource
     * 
     */
    @Import(name="repository")
    private @Nullable Output<OSPolicyResourceRepositoryResourceArgs> repository;

    /**
     * @return Package repository resource
     * 
     */
    public Optional<Output<OSPolicyResourceRepositoryResourceArgs>> repository() {
        return Optional.ofNullable(this.repository);
    }

    private OSPolicyResourceArgs() {}

    private OSPolicyResourceArgs(OSPolicyResourceArgs $) {
        this.exec = $.exec;
        this.file = $.file;
        this.id = $.id;
        this.pkg = $.pkg;
        this.repository = $.repository;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OSPolicyResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OSPolicyResourceArgs $;

        public Builder() {
            $ = new OSPolicyResourceArgs();
        }

        public Builder(OSPolicyResourceArgs defaults) {
            $ = new OSPolicyResourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param exec Exec resource
         * 
         * @return builder
         * 
         */
        public Builder exec(@Nullable Output<OSPolicyResourceExecResourceArgs> exec) {
            $.exec = exec;
            return this;
        }

        /**
         * @param exec Exec resource
         * 
         * @return builder
         * 
         */
        public Builder exec(OSPolicyResourceExecResourceArgs exec) {
            return exec(Output.of(exec));
        }

        /**
         * @param file File resource
         * 
         * @return builder
         * 
         */
        public Builder file(@Nullable Output<OSPolicyResourceFileResourceArgs> file) {
            $.file = file;
            return this;
        }

        /**
         * @param file File resource
         * 
         * @return builder
         * 
         */
        public Builder file(OSPolicyResourceFileResourceArgs file) {
            return file(Output.of(file));
        }

        /**
         * @param id The id of the resource with the following restrictions: * Must contain only lowercase letters, numbers, and hyphens. * Must start with a letter. * Must be between 1-63 characters. * Must end with a number or a letter. * Must be unique within the OS policy.
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The id of the resource with the following restrictions: * Must contain only lowercase letters, numbers, and hyphens. * Must start with a letter. * Must be between 1-63 characters. * Must end with a number or a letter. * Must be unique within the OS policy.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param pkg Package resource
         * 
         * @return builder
         * 
         */
        public Builder pkg(@Nullable Output<OSPolicyResourcePackageResourceArgs> pkg) {
            $.pkg = pkg;
            return this;
        }

        /**
         * @param pkg Package resource
         * 
         * @return builder
         * 
         */
        public Builder pkg(OSPolicyResourcePackageResourceArgs pkg) {
            return pkg(Output.of(pkg));
        }

        /**
         * @param repository Package repository resource
         * 
         * @return builder
         * 
         */
        public Builder repository(@Nullable Output<OSPolicyResourceRepositoryResourceArgs> repository) {
            $.repository = repository;
            return this;
        }

        /**
         * @param repository Package repository resource
         * 
         * @return builder
         * 
         */
        public Builder repository(OSPolicyResourceRepositoryResourceArgs repository) {
            return repository(Output.of(repository));
        }

        public OSPolicyResourceArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}
