// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.codegurureviewer;

import com.pulumi.awsnative.codegurureviewer.enums.RepositoryAssociationType;
import com.pulumi.awsnative.codegurureviewer.inputs.RepositoryAssociationTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RepositoryAssociationArgs extends com.pulumi.resources.ResourceArgs {

    public static final RepositoryAssociationArgs Empty = new RepositoryAssociationArgs();

    /**
     * The name of the S3 bucket associated with an associated S3 repository. It must start with `codeguru-reviewer-`.
     * 
     */
    @Import(name="bucketName")
    private @Nullable Output<String> bucketName;

    /**
     * @return The name of the S3 bucket associated with an associated S3 repository. It must start with `codeguru-reviewer-`.
     * 
     */
    public Optional<Output<String>> bucketName() {
        return Optional.ofNullable(this.bucketName);
    }

    /**
     * The Amazon Resource Name (ARN) of an AWS CodeStar Connections connection.
     * 
     */
    @Import(name="connectionArn")
    private @Nullable Output<String> connectionArn;

    /**
     * @return The Amazon Resource Name (ARN) of an AWS CodeStar Connections connection.
     * 
     */
    public Optional<Output<String>> connectionArn() {
        return Optional.ofNullable(this.connectionArn);
    }

    /**
     * Name of the repository to be associated.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the repository to be associated.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The owner of the repository. For a Bitbucket repository, this is the username for the account that owns the repository.
     * 
     */
    @Import(name="owner")
    private @Nullable Output<String> owner;

    /**
     * @return The owner of the repository. For a Bitbucket repository, this is the username for the account that owns the repository.
     * 
     */
    public Optional<Output<String>> owner() {
        return Optional.ofNullable(this.owner);
    }

    /**
     * The tags associated with a repository association.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<RepositoryAssociationTagArgs>> tags;

    /**
     * @return The tags associated with a repository association.
     * 
     */
    public Optional<Output<List<RepositoryAssociationTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The type of repository to be associated.
     * 
     */
    @Import(name="type", required=true)
    private Output<RepositoryAssociationType> type;

    /**
     * @return The type of repository to be associated.
     * 
     */
    public Output<RepositoryAssociationType> type() {
        return this.type;
    }

    private RepositoryAssociationArgs() {}

    private RepositoryAssociationArgs(RepositoryAssociationArgs $) {
        this.bucketName = $.bucketName;
        this.connectionArn = $.connectionArn;
        this.name = $.name;
        this.owner = $.owner;
        this.tags = $.tags;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RepositoryAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RepositoryAssociationArgs $;

        public Builder() {
            $ = new RepositoryAssociationArgs();
        }

        public Builder(RepositoryAssociationArgs defaults) {
            $ = new RepositoryAssociationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bucketName The name of the S3 bucket associated with an associated S3 repository. It must start with `codeguru-reviewer-`.
         * 
         * @return builder
         * 
         */
        public Builder bucketName(@Nullable Output<String> bucketName) {
            $.bucketName = bucketName;
            return this;
        }

        /**
         * @param bucketName The name of the S3 bucket associated with an associated S3 repository. It must start with `codeguru-reviewer-`.
         * 
         * @return builder
         * 
         */
        public Builder bucketName(String bucketName) {
            return bucketName(Output.of(bucketName));
        }

        /**
         * @param connectionArn The Amazon Resource Name (ARN) of an AWS CodeStar Connections connection.
         * 
         * @return builder
         * 
         */
        public Builder connectionArn(@Nullable Output<String> connectionArn) {
            $.connectionArn = connectionArn;
            return this;
        }

        /**
         * @param connectionArn The Amazon Resource Name (ARN) of an AWS CodeStar Connections connection.
         * 
         * @return builder
         * 
         */
        public Builder connectionArn(String connectionArn) {
            return connectionArn(Output.of(connectionArn));
        }

        /**
         * @param name Name of the repository to be associated.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the repository to be associated.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param owner The owner of the repository. For a Bitbucket repository, this is the username for the account that owns the repository.
         * 
         * @return builder
         * 
         */
        public Builder owner(@Nullable Output<String> owner) {
            $.owner = owner;
            return this;
        }

        /**
         * @param owner The owner of the repository. For a Bitbucket repository, this is the username for the account that owns the repository.
         * 
         * @return builder
         * 
         */
        public Builder owner(String owner) {
            return owner(Output.of(owner));
        }

        /**
         * @param tags The tags associated with a repository association.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<RepositoryAssociationTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags The tags associated with a repository association.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<RepositoryAssociationTagArgs> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags The tags associated with a repository association.
         * 
         * @return builder
         * 
         */
        public Builder tags(RepositoryAssociationTagArgs... tags) {
            return tags(List.of(tags));
        }

        /**
         * @param type The type of repository to be associated.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<RepositoryAssociationType> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of repository to be associated.
         * 
         * @return builder
         * 
         */
        public Builder type(RepositoryAssociationType type) {
            return type(Output.of(type));
        }

        public RepositoryAssociationArgs build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
