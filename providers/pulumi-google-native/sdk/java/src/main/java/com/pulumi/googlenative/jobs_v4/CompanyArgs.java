// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.jobs_v4;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.jobs_v4.enums.CompanySize;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CompanyArgs extends com.pulumi.resources.ResourceArgs {

    public static final CompanyArgs Empty = new CompanyArgs();

    /**
     * The URI to employer&#39;s career site or careers page on the employer&#39;s web site, for example, &#34;https://careers.google.com&#34;.
     * 
     */
    @Import(name="careerSiteUri")
    private @Nullable Output<String> careerSiteUri;

    /**
     * @return The URI to employer&#39;s career site or careers page on the employer&#39;s web site, for example, &#34;https://careers.google.com&#34;.
     * 
     */
    public Optional<Output<String>> careerSiteUri() {
        return Optional.ofNullable(this.careerSiteUri);
    }

    /**
     * The display name of the company, for example, &#34;Google LLC&#34;.
     * 
     */
    @Import(name="displayName", required=true)
    private Output<String> displayName;

    /**
     * @return The display name of the company, for example, &#34;Google LLC&#34;.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }

    /**
     * Equal Employment Opportunity legal disclaimer text to be associated with all jobs, and typically to be displayed in all roles. The maximum number of allowed characters is 500.
     * 
     */
    @Import(name="eeoText")
    private @Nullable Output<String> eeoText;

    /**
     * @return Equal Employment Opportunity legal disclaimer text to be associated with all jobs, and typically to be displayed in all roles. The maximum number of allowed characters is 500.
     * 
     */
    public Optional<Output<String>> eeoText() {
        return Optional.ofNullable(this.eeoText);
    }

    /**
     * Client side company identifier, used to uniquely identify the company. The maximum number of allowed characters is 255.
     * 
     */
    @Import(name="externalId", required=true)
    private Output<String> externalId;

    /**
     * @return Client side company identifier, used to uniquely identify the company. The maximum number of allowed characters is 255.
     * 
     */
    public Output<String> externalId() {
        return this.externalId;
    }

    /**
     * The street address of the company&#39;s main headquarters, which may be different from the job location. The service attempts to geolocate the provided address, and populates a more specific location wherever possible in DerivedInfo.headquarters_location.
     * 
     */
    @Import(name="headquartersAddress")
    private @Nullable Output<String> headquartersAddress;

    /**
     * @return The street address of the company&#39;s main headquarters, which may be different from the job location. The service attempts to geolocate the provided address, and populates a more specific location wherever possible in DerivedInfo.headquarters_location.
     * 
     */
    public Optional<Output<String>> headquartersAddress() {
        return Optional.ofNullable(this.headquartersAddress);
    }

    /**
     * Set to true if it is the hiring agency that post jobs for other employers. Defaults to false if not provided.
     * 
     */
    @Import(name="hiringAgency")
    private @Nullable Output<Boolean> hiringAgency;

    /**
     * @return Set to true if it is the hiring agency that post jobs for other employers. Defaults to false if not provided.
     * 
     */
    public Optional<Output<Boolean>> hiringAgency() {
        return Optional.ofNullable(this.hiringAgency);
    }

    /**
     * A URI that hosts the employer&#39;s company logo.
     * 
     */
    @Import(name="imageUri")
    private @Nullable Output<String> imageUri;

    /**
     * @return A URI that hosts the employer&#39;s company logo.
     * 
     */
    public Optional<Output<String>> imageUri() {
        return Optional.ofNullable(this.imageUri);
    }

    /**
     * A list of keys of filterable Job.custom_attributes, whose corresponding `string_values` are used in keyword searches. Jobs with `string_values` under these specified field keys are returned if any of the values match the search keyword. Custom field values with parenthesis, brackets and special symbols are not searchable as-is, and those keyword queries must be surrounded by quotes.
     * 
     */
    @Import(name="keywordSearchableJobCustomAttributes")
    private @Nullable Output<List<String>> keywordSearchableJobCustomAttributes;

    /**
     * @return A list of keys of filterable Job.custom_attributes, whose corresponding `string_values` are used in keyword searches. Jobs with `string_values` under these specified field keys are returned if any of the values match the search keyword. Custom field values with parenthesis, brackets and special symbols are not searchable as-is, and those keyword queries must be surrounded by quotes.
     * 
     */
    public Optional<Output<List<String>>> keywordSearchableJobCustomAttributes() {
        return Optional.ofNullable(this.keywordSearchableJobCustomAttributes);
    }

    /**
     * Required during company update. The resource name for a company. This is generated by the service when a company is created. The format is &#34;projects/{project_id}/tenants/{tenant_id}/companies/{company_id}&#34;, for example, &#34;projects/foo/tenants/bar/companies/baz&#34;.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Required during company update. The resource name for a company. This is generated by the service when a company is created. The format is &#34;projects/{project_id}/tenants/{tenant_id}/companies/{company_id}&#34;, for example, &#34;projects/foo/tenants/bar/companies/baz&#34;.
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

    /**
     * The employer&#39;s company size.
     * 
     */
    @Import(name="size")
    private @Nullable Output<CompanySize> size;

    /**
     * @return The employer&#39;s company size.
     * 
     */
    public Optional<Output<CompanySize>> size() {
        return Optional.ofNullable(this.size);
    }

    @Import(name="tenantId", required=true)
    private Output<String> tenantId;

    public Output<String> tenantId() {
        return this.tenantId;
    }

    /**
     * The URI representing the company&#39;s primary web site or home page, for example, &#34;https://www.google.com&#34;. The maximum number of allowed characters is 255.
     * 
     */
    @Import(name="websiteUri")
    private @Nullable Output<String> websiteUri;

    /**
     * @return The URI representing the company&#39;s primary web site or home page, for example, &#34;https://www.google.com&#34;. The maximum number of allowed characters is 255.
     * 
     */
    public Optional<Output<String>> websiteUri() {
        return Optional.ofNullable(this.websiteUri);
    }

    private CompanyArgs() {}

    private CompanyArgs(CompanyArgs $) {
        this.careerSiteUri = $.careerSiteUri;
        this.displayName = $.displayName;
        this.eeoText = $.eeoText;
        this.externalId = $.externalId;
        this.headquartersAddress = $.headquartersAddress;
        this.hiringAgency = $.hiringAgency;
        this.imageUri = $.imageUri;
        this.keywordSearchableJobCustomAttributes = $.keywordSearchableJobCustomAttributes;
        this.name = $.name;
        this.project = $.project;
        this.size = $.size;
        this.tenantId = $.tenantId;
        this.websiteUri = $.websiteUri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CompanyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CompanyArgs $;

        public Builder() {
            $ = new CompanyArgs();
        }

        public Builder(CompanyArgs defaults) {
            $ = new CompanyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param careerSiteUri The URI to employer&#39;s career site or careers page on the employer&#39;s web site, for example, &#34;https://careers.google.com&#34;.
         * 
         * @return builder
         * 
         */
        public Builder careerSiteUri(@Nullable Output<String> careerSiteUri) {
            $.careerSiteUri = careerSiteUri;
            return this;
        }

        /**
         * @param careerSiteUri The URI to employer&#39;s career site or careers page on the employer&#39;s web site, for example, &#34;https://careers.google.com&#34;.
         * 
         * @return builder
         * 
         */
        public Builder careerSiteUri(String careerSiteUri) {
            return careerSiteUri(Output.of(careerSiteUri));
        }

        /**
         * @param displayName The display name of the company, for example, &#34;Google LLC&#34;.
         * 
         * @return builder
         * 
         */
        public Builder displayName(Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName The display name of the company, for example, &#34;Google LLC&#34;.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param eeoText Equal Employment Opportunity legal disclaimer text to be associated with all jobs, and typically to be displayed in all roles. The maximum number of allowed characters is 500.
         * 
         * @return builder
         * 
         */
        public Builder eeoText(@Nullable Output<String> eeoText) {
            $.eeoText = eeoText;
            return this;
        }

        /**
         * @param eeoText Equal Employment Opportunity legal disclaimer text to be associated with all jobs, and typically to be displayed in all roles. The maximum number of allowed characters is 500.
         * 
         * @return builder
         * 
         */
        public Builder eeoText(String eeoText) {
            return eeoText(Output.of(eeoText));
        }

        /**
         * @param externalId Client side company identifier, used to uniquely identify the company. The maximum number of allowed characters is 255.
         * 
         * @return builder
         * 
         */
        public Builder externalId(Output<String> externalId) {
            $.externalId = externalId;
            return this;
        }

        /**
         * @param externalId Client side company identifier, used to uniquely identify the company. The maximum number of allowed characters is 255.
         * 
         * @return builder
         * 
         */
        public Builder externalId(String externalId) {
            return externalId(Output.of(externalId));
        }

        /**
         * @param headquartersAddress The street address of the company&#39;s main headquarters, which may be different from the job location. The service attempts to geolocate the provided address, and populates a more specific location wherever possible in DerivedInfo.headquarters_location.
         * 
         * @return builder
         * 
         */
        public Builder headquartersAddress(@Nullable Output<String> headquartersAddress) {
            $.headquartersAddress = headquartersAddress;
            return this;
        }

        /**
         * @param headquartersAddress The street address of the company&#39;s main headquarters, which may be different from the job location. The service attempts to geolocate the provided address, and populates a more specific location wherever possible in DerivedInfo.headquarters_location.
         * 
         * @return builder
         * 
         */
        public Builder headquartersAddress(String headquartersAddress) {
            return headquartersAddress(Output.of(headquartersAddress));
        }

        /**
         * @param hiringAgency Set to true if it is the hiring agency that post jobs for other employers. Defaults to false if not provided.
         * 
         * @return builder
         * 
         */
        public Builder hiringAgency(@Nullable Output<Boolean> hiringAgency) {
            $.hiringAgency = hiringAgency;
            return this;
        }

        /**
         * @param hiringAgency Set to true if it is the hiring agency that post jobs for other employers. Defaults to false if not provided.
         * 
         * @return builder
         * 
         */
        public Builder hiringAgency(Boolean hiringAgency) {
            return hiringAgency(Output.of(hiringAgency));
        }

        /**
         * @param imageUri A URI that hosts the employer&#39;s company logo.
         * 
         * @return builder
         * 
         */
        public Builder imageUri(@Nullable Output<String> imageUri) {
            $.imageUri = imageUri;
            return this;
        }

        /**
         * @param imageUri A URI that hosts the employer&#39;s company logo.
         * 
         * @return builder
         * 
         */
        public Builder imageUri(String imageUri) {
            return imageUri(Output.of(imageUri));
        }

        /**
         * @param keywordSearchableJobCustomAttributes A list of keys of filterable Job.custom_attributes, whose corresponding `string_values` are used in keyword searches. Jobs with `string_values` under these specified field keys are returned if any of the values match the search keyword. Custom field values with parenthesis, brackets and special symbols are not searchable as-is, and those keyword queries must be surrounded by quotes.
         * 
         * @return builder
         * 
         */
        public Builder keywordSearchableJobCustomAttributes(@Nullable Output<List<String>> keywordSearchableJobCustomAttributes) {
            $.keywordSearchableJobCustomAttributes = keywordSearchableJobCustomAttributes;
            return this;
        }

        /**
         * @param keywordSearchableJobCustomAttributes A list of keys of filterable Job.custom_attributes, whose corresponding `string_values` are used in keyword searches. Jobs with `string_values` under these specified field keys are returned if any of the values match the search keyword. Custom field values with parenthesis, brackets and special symbols are not searchable as-is, and those keyword queries must be surrounded by quotes.
         * 
         * @return builder
         * 
         */
        public Builder keywordSearchableJobCustomAttributes(List<String> keywordSearchableJobCustomAttributes) {
            return keywordSearchableJobCustomAttributes(Output.of(keywordSearchableJobCustomAttributes));
        }

        /**
         * @param keywordSearchableJobCustomAttributes A list of keys of filterable Job.custom_attributes, whose corresponding `string_values` are used in keyword searches. Jobs with `string_values` under these specified field keys are returned if any of the values match the search keyword. Custom field values with parenthesis, brackets and special symbols are not searchable as-is, and those keyword queries must be surrounded by quotes.
         * 
         * @return builder
         * 
         */
        public Builder keywordSearchableJobCustomAttributes(String... keywordSearchableJobCustomAttributes) {
            return keywordSearchableJobCustomAttributes(List.of(keywordSearchableJobCustomAttributes));
        }

        /**
         * @param name Required during company update. The resource name for a company. This is generated by the service when a company is created. The format is &#34;projects/{project_id}/tenants/{tenant_id}/companies/{company_id}&#34;, for example, &#34;projects/foo/tenants/bar/companies/baz&#34;.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Required during company update. The resource name for a company. This is generated by the service when a company is created. The format is &#34;projects/{project_id}/tenants/{tenant_id}/companies/{company_id}&#34;, for example, &#34;projects/foo/tenants/bar/companies/baz&#34;.
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

        /**
         * @param size The employer&#39;s company size.
         * 
         * @return builder
         * 
         */
        public Builder size(@Nullable Output<CompanySize> size) {
            $.size = size;
            return this;
        }

        /**
         * @param size The employer&#39;s company size.
         * 
         * @return builder
         * 
         */
        public Builder size(CompanySize size) {
            return size(Output.of(size));
        }

        public Builder tenantId(Output<String> tenantId) {
            $.tenantId = tenantId;
            return this;
        }

        public Builder tenantId(String tenantId) {
            return tenantId(Output.of(tenantId));
        }

        /**
         * @param websiteUri The URI representing the company&#39;s primary web site or home page, for example, &#34;https://www.google.com&#34;. The maximum number of allowed characters is 255.
         * 
         * @return builder
         * 
         */
        public Builder websiteUri(@Nullable Output<String> websiteUri) {
            $.websiteUri = websiteUri;
            return this;
        }

        /**
         * @param websiteUri The URI representing the company&#39;s primary web site or home page, for example, &#34;https://www.google.com&#34;. The maximum number of allowed characters is 255.
         * 
         * @return builder
         * 
         */
        public Builder websiteUri(String websiteUri) {
            return websiteUri(Output.of(websiteUri));
        }

        public CompanyArgs build() {
            $.displayName = Objects.requireNonNull($.displayName, "expected parameter 'displayName' to be non-null");
            $.externalId = Objects.requireNonNull($.externalId, "expected parameter 'externalId' to be non-null");
            $.tenantId = Objects.requireNonNull($.tenantId, "expected parameter 'tenantId' to be non-null");
            return $;
        }
    }

}
