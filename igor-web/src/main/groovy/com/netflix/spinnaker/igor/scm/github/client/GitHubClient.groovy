/*
 * Copyright 2015 Netflix, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.netflix.spinnaker.igor.scm.github.client

import com.netflix.spinnaker.igor.scm.github.client.model.CompareCommitsResponse
import retrofit.http.GET
import retrofit.http.Path

/**
 * Interface for interacting with a GitHub REST API
 * https://developer.github.com/v3/repos/commits/#list-commits-on-a-repository
 */
interface GitHubClient {
    @GET('/repos/{projectKey}/{repositorySlug}/compare/{fromCommit}...{toCommit}')
    CompareCommitsResponse getCompareCommits(
        @Path('projectKey') String projectKey,
        @Path('repositorySlug') String repositorySlug,
        @Path('fromCommit') String fromCommit,
        @Path('toCommit') String toCommit)
}

