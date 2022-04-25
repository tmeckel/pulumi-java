// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Factory&#39;s VSTS repo information.
 * 
 */
public final class FactoryVSTSConfigurationResponse extends com.pulumi.resources.InvokeArgs {

    public static final FactoryVSTSConfigurationResponse Empty = new FactoryVSTSConfigurationResponse();

    /**
     * Account name.
     * 
     */
    @Import(name="accountName", required=true)
    private String accountName;

    /**
     * @return Account name.
     * 
     */
    public String accountName() {
        return this.accountName;
    }

    /**
     * Collaboration branch.
     * 
     */
    @Import(name="collaborationBranch", required=true)
    private String collaborationBranch;

    /**
     * @return Collaboration branch.
     * 
     */
    public String collaborationBranch() {
        return this.collaborationBranch;
    }

    /**
     * Last commit id.
     * 
     */
    @Import(name="lastCommitId")
    private @Nullable String lastCommitId;

    /**
     * @return Last commit id.
     * 
     */
    public Optional<String> lastCommitId() {
        return Optional.ofNullable(this.lastCommitId);
    }

    /**
     * VSTS project name.
     * 
     */
    @Import(name="projectName", required=true)
    private String projectName;

    /**
     * @return VSTS project name.
     * 
     */
    public String projectName() {
        return this.projectName;
    }

    /**
     * Repository name.
     * 
     */
    @Import(name="repositoryName", required=true)
    private String repositoryName;

    /**
     * @return Repository name.
     * 
     */
    public String repositoryName() {
        return this.repositoryName;
    }

    /**
     * Root folder.
     * 
     */
    @Import(name="rootFolder", required=true)
    private String rootFolder;

    /**
     * @return Root folder.
     * 
     */
    public String rootFolder() {
        return this.rootFolder;
    }

    /**
     * VSTS tenant id.
     * 
     */
    @Import(name="tenantId")
    private @Nullable String tenantId;

    /**
     * @return VSTS tenant id.
     * 
     */
    public Optional<String> tenantId() {
        return Optional.ofNullable(this.tenantId);
    }

    /**
     * Type of repo configuration.
     * Expected value is &#39;FactoryVSTSConfiguration&#39;.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    /**
     * @return Type of repo configuration.
     * Expected value is &#39;FactoryVSTSConfiguration&#39;.
     * 
     */
    public String type() {
        return this.type;
    }

    private FactoryVSTSConfigurationResponse() {}

    private FactoryVSTSConfigurationResponse(FactoryVSTSConfigurationResponse $) {
        this.accountName = $.accountName;
        this.collaborationBranch = $.collaborationBranch;
        this.lastCommitId = $.lastCommitId;
        this.projectName = $.projectName;
        this.repositoryName = $.repositoryName;
        this.rootFolder = $.rootFolder;
        this.tenantId = $.tenantId;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FactoryVSTSConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FactoryVSTSConfigurationResponse $;

        public Builder() {
            $ = new FactoryVSTSConfigurationResponse();
        }

        public Builder(FactoryVSTSConfigurationResponse defaults) {
            $ = new FactoryVSTSConfigurationResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountName Account name.
         * 
         * @return builder
         * 
         */
        public Builder accountName(String accountName) {
            $.accountName = accountName;
            return this;
        }

        /**
         * @param collaborationBranch Collaboration branch.
         * 
         * @return builder
         * 
         */
        public Builder collaborationBranch(String collaborationBranch) {
            $.collaborationBranch = collaborationBranch;
            return this;
        }

        /**
         * @param lastCommitId Last commit id.
         * 
         * @return builder
         * 
         */
        public Builder lastCommitId(@Nullable String lastCommitId) {
            $.lastCommitId = lastCommitId;
            return this;
        }

        /**
         * @param projectName VSTS project name.
         * 
         * @return builder
         * 
         */
        public Builder projectName(String projectName) {
            $.projectName = projectName;
            return this;
        }

        /**
         * @param repositoryName Repository name.
         * 
         * @return builder
         * 
         */
        public Builder repositoryName(String repositoryName) {
            $.repositoryName = repositoryName;
            return this;
        }

        /**
         * @param rootFolder Root folder.
         * 
         * @return builder
         * 
         */
        public Builder rootFolder(String rootFolder) {
            $.rootFolder = rootFolder;
            return this;
        }

        /**
         * @param tenantId VSTS tenant id.
         * 
         * @return builder
         * 
         */
        public Builder tenantId(@Nullable String tenantId) {
            $.tenantId = tenantId;
            return this;
        }

        /**
         * @param type Type of repo configuration.
         * Expected value is &#39;FactoryVSTSConfiguration&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public FactoryVSTSConfigurationResponse build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.collaborationBranch = Objects.requireNonNull($.collaborationBranch, "expected parameter 'collaborationBranch' to be non-null");
            $.projectName = Objects.requireNonNull($.projectName, "expected parameter 'projectName' to be non-null");
            $.repositoryName = Objects.requireNonNull($.repositoryName, "expected parameter 'repositoryName' to be non-null");
            $.rootFolder = Objects.requireNonNull($.rootFolder, "expected parameter 'rootFolder' to be non-null");
            $.type = Codegen.stringProp("type").arg($.type).require();
            return $;
        }
    }

}
